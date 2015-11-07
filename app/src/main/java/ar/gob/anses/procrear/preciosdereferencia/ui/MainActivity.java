package ar.gob.anses.procrear.preciosdereferencia.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.SearchView.OnQueryTextListener;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigDecimal;
import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

import ar.gob.anses.procrear.preciosdereferencia.R;
import ar.gob.anses.procrear.preciosdereferencia.db.ProductoList;
import ar.gob.anses.procrear.preciosdereferencia.dto.Producto;
import ar.gob.anses.procrear.preciosdereferencia.dto.Proveedor;
import ar.gob.anses.procrear.preciosdereferencia.utils.FontUtils;

public class MainActivity extends ActionBarActivity {
    public static final String URL_ANSES_DENUNCIAS = "http://servicioswww.anses.gov.ar/REPRO.Sitio/Paginas/Denuncias.aspx";

    private static final String STATE_IS_ACTION_VIEW_EXPANDED = "isActionViewExpanded";
    private static final String STATE_SEARCH_QUERY = "searchQuery";

    private boolean mIsActionViewExpanded;
    private String mSearchQuery;

    private MenuItem mSearchItem;
    private SearchView mSearchView;
    private ListView mListViewProductos;
    private TextView mTextViewHeader;
    private ProgressBar mProgressBar;

    private ProductoListAdapter mAdapterProductos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        // HACK: ActionBar does not properly get the logo drawable and instead
        // uses the icon drawable on versions older than Honeycomb.
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.HONEYCOMB) {
            actionBar.setLogo(R.drawable.app_logo);
            actionBar.setDisplayUseLogoEnabled(true);
        }
        actionBar.setDisplayShowTitleEnabled(false);

        mListViewProductos = (ListView) findViewById(R.id.listViewMainProductos);

        // Add header view
        View viewHeader = getLayoutInflater().inflate(R.layout.list_view_header, mListViewProductos, false);
        mTextViewHeader = (TextView) viewHeader.findViewById(R.id.textViewListViewHeader);
        FontUtils.setTypeface(FontUtils.getTypeface(this, FontUtils.PATH_TYPEFACE_HELVETICA_LIGHT), mTextViewHeader);
        mListViewProductos.addHeaderView(viewHeader);

        // Set footer view text
        TextView textViewViewFooter = (TextView) findViewById(R.id.textViewFooter);
        FontUtils.setTypeface(FontUtils.getTypeface(this, FontUtils.PATH_TYPEFACE_HELVETICA_BOLD), textViewViewFooter);
        textViewViewFooter.setText(R.string.main_view_producto_list_footer_text);

        mProgressBar = (ProgressBar) findViewById(R.id.progressBarMainLoading);

        // Initialize UI components
        new InitActivityAsyncTask().execute();

        if (savedInstanceState != null) {
            mSearchQuery = savedInstanceState.getString(STATE_SEARCH_QUERY);
            mIsActionViewExpanded = savedInstanceState.getBoolean(STATE_IS_ACTION_VIEW_EXPANDED);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        if (mSearchItem != null)
            outState.putBoolean(STATE_IS_ACTION_VIEW_EXPANDED, MenuItemCompat.isActionViewExpanded(mSearchItem));

        if (mSearchView != null) {
            CharSequence searchQuery = mSearchView.getQuery();
            if (searchQuery != null && searchQuery.length() > 0)
                outState.putString(STATE_SEARCH_QUERY, searchQuery.toString());
        }

        super.onSaveInstanceState(outState);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (mAdapterProductos != null) {
            // Inflate the menu
            getMenuInflater().inflate(R.menu.main_activity_actions, menu);

            mSearchItem = menu.findItem(R.id.action_buscar);
            MenuItemCompat.setOnActionExpandListener(mSearchItem,
                    new MenuItemCompat.OnActionExpandListener() {

                        @Override
                        public boolean onMenuItemActionExpand(MenuItem item) {
                            return true;
                        }

                        @Override
                        public boolean onMenuItemActionCollapse(MenuItem item) {
                            if (mSearchView.getQuery().length() > 0)
                                mSearchView.setQuery("", false);

                            return true;
                        }
                    });
            mSearchView = (SearchView) MenuItemCompat.getActionView(mSearchItem);
            mSearchView.setOnQueryTextListener(new OnQueryTextListener() {

                @Override
                public boolean onQueryTextSubmit(String query) {
                    return false;
                }

                @Override
                public boolean onQueryTextChange(String newText) {
                    mAdapterProductos.getFilter().filter(newText);

                    return true;
                }
            });

            if (mIsActionViewExpanded) {
                if (MenuItemCompat.expandActionView(mSearchItem)) {
                    if (!TextUtils.isEmpty(mSearchQuery))
                        mSearchView.setQuery(mSearchQuery, false);
                    mSearchView.requestFocus();
                }
            }
        }

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_denuncia:
                Uri uri = Uri.parse(URL_ANSES_DENUNCIAS);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                Toast.makeText(this,
                        R.string.main_view_redireccionando_sitio_anses_message,
                        Toast.LENGTH_LONG).show();

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private String currencyFormat(BigDecimal n) {
        return NumberFormat.getCurrencyInstance(Locale.US).format(n);
    }

    @SuppressLint("NewApi")
    private static String stripDiacritics(String s) {
        return Normalizer.normalize(s, Form.NFD).replaceAll(
                "\\p{InCombiningDiacriticalMarks}+", "");
    }

    private class InitActivityAsyncTask extends AsyncTask<Void, Void, List<Producto>> {

        @Override
        protected List<Producto> doInBackground(Void... params) {
            return new LinkedList<>(Arrays.asList(ProductoList.PRODUCTOS));
        }

        @Override
        protected void onPostExecute(List<Producto> result) {
            // Hide progressBar
            mProgressBar.setVisibility(View.GONE);

            if (result != null && result.size() > 0) {
                mTextViewHeader.setText(getString(
                        R.string.main_view_producto_list_header_text,
                        result.size()));

                mListViewProductos.setAdapter(
                        mAdapterProductos =
                                new ProductoListAdapter(MainActivity.this, R.layout.list_item_producto, result));

                mAdapterProductos
                        .registerDataSetObserver(new DataSetObserver() {

                            @Override
                            public void onInvalidated() {
                                super.onInvalidated();

                                mTextViewHeader.setText(R.string.main_view_producto_list_header_empty_text);
                            }

                            @Override
                            public void onChanged() {
                                super.onChanged();

                                mTextViewHeader.setText(getString(
                                        R.string.main_view_producto_list_header_text,
                                        mAdapterProductos.getCount()));
                            }
                        });

                // Refresh menu items
                supportInvalidateOptionsMenu();
            } else {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage(R.string.main_view_dialog_no_productos_restart_app)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                // Restart app
                                Intent intent = getBaseContext().getPackageManager()
                                        .getLaunchIntentForPackage(
                                                getBaseContext().getPackageName());
                                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                startActivity(intent);
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                // User cancelled the dialog
                                finish();
                            }
                        });
                // Create the AlertDialog object and show it
                builder.create().show();
            }
        }
    }

    private class ProductoListAdapter extends ArrayAdapter<Producto> {
        private Context context;
        private int resourceId;
        private List<Producto> mObjects;
        private ArrayFilter mFilter;
        private final Object mLock = new Object();
        private ArrayList<Producto> mOriginalValues;

        public ProductoListAdapter(Context context, int resourceId,
                                   List<Producto> items) {
            super(context, resourceId, items);
            this.context = context;
            this.resourceId = resourceId;
            mObjects = items;
        }

        private class ViewHolder {
            public TextView textViewProducto;
            public TextView textViewPrecio;
            public TextView textViewDetalle;
            public ImageView imageViewLogo;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder holder;
            LayoutInflater mInflater = (LayoutInflater) context
                    .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            if (convertView == null) {
                convertView = mInflater.inflate(resourceId, parent, false);
                holder = new ViewHolder();
                holder.textViewProducto = (TextView) convertView
                        .findViewById(R.id.textViewListItemProducto);
                holder.textViewPrecio = (TextView) convertView
                        .findViewById(R.id.textViewListItemPrecio);
                holder.textViewDetalle = (TextView) convertView
                        .findViewById(R.id.textViewListItemDetalle);
                holder.imageViewLogo = (ImageView) convertView
                        .findViewById(R.id.imageViewListItemLogo);
                convertView.setTag(holder);
            } else
                holder = (ViewHolder) convertView.getTag();

            Producto producto = getItem(position);
            Proveedor proveedor = producto.getProveedor();
            holder.textViewProducto.setText(producto.getNombre());
            holder.textViewPrecio.setText(currencyFormat(producto.getPrecio()));
            holder.textViewDetalle.setText(producto.getDetalle());
            if (proveedor != null)
                holder.imageViewLogo.setImageResource(proveedor
                        .getLogoResourceId());
            else
                holder.imageViewLogo.setImageDrawable(null);

            FontUtils.setTypeface(FontUtils.getTypeface(MainActivity.this,
                            FontUtils.PATH_TYPEFACE_HELVETICA_LIGHT),
                    holder.textViewProducto);

            return convertView;
        }

        @Override
        public int getCount() {
            return mObjects.size();
        }

        @Override
        public Producto getItem(int position) {
            return mObjects.get(position);
        }

        @Override
        public Filter getFilter() {
            if (mFilter == null)
                mFilter = new ArrayFilter();

            return mFilter;
        }

        private class ArrayFilter extends Filter {
            @Override
            protected FilterResults performFiltering(CharSequence prefix) {
                FilterResults results = new FilterResults();

                if (mOriginalValues == null) {
                    synchronized (mLock) {
                        mOriginalValues = new ArrayList<>(mObjects);
                    }
                }

                ArrayList<Producto> values;
                synchronized (mLock) {
                    values = new ArrayList<>(mOriginalValues);
                }
                if (prefix == null || prefix.length() == 0) {
                    results.values = values;
                    results.count = values.size();
                } else {
                    String prefixString = prefix.toString().toLowerCase(
                            getResources().getConfiguration().locale);

                    ArrayList<Producto> newValues = new ArrayList<>();
                    for (int i = 0; i < values.size(); i++) {
                        Producto value = values.get(i);
                        String valueText = stripDiacritics(value.toString().toLowerCase(getResources().getConfiguration().locale));
                        if (valueText.contains(prefixString)) {
                            // Then try to match with any substring value
                            newValues.add(value);
                        }
                    }

                    results.values = newValues;
                    results.count = newValues.size();
                }

                return results;
            }

            @SuppressWarnings("unchecked")
            @Override
            protected void publishResults(CharSequence constraint,
                                          FilterResults results) {
                // noinspection unchecked
                mObjects = (List<Producto>) results.values;

                if (results.count > 0) {
                    notifyDataSetChanged();
                } else
                    notifyDataSetInvalidated();
            }
        }
    }
}