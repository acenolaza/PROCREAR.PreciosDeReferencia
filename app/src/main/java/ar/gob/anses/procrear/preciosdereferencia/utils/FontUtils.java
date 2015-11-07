package ar.gob.anses.procrear.preciosdereferencia.utils;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Hashtable;

public class FontUtils {

    private static final String PATH_TYPEFACE_FOLDER = "fonts/";
    public static final String PATH_TYPEFACE_HELVETICA_LIGHT = PATH_TYPEFACE_FOLDER
            + "HelveticaLTStd-Light.otf";
    public static final String PATH_TYPEFACE_HELVETICA_BOLD = PATH_TYPEFACE_FOLDER
            + "HelveticaLTStd-Bold.otf";

    private static boolean DO_SUBPIXEL_RENDERING = true;

    private static final Hashtable<String, Typeface> mCache = new Hashtable<String, Typeface>();

    public static Typeface getTypeface(Context context, String path) {
        synchronized (mCache) {
            if (!mCache.containsKey(path)) {
                Typeface typeface = Typeface.createFromAsset(
                        context.getAssets(), path);
                mCache.put(path, typeface);
            }
            return mCache.get(path);
        }
    }

    /**
     * Sets the {@link android.graphics.Typeface} <code>typeface</code> for all {@link android.widget.TextView}
     * 's in the view-hierarchy of {@link android.view.ViewGroup} <code>parent</code>.
     *
     * @param typeface
     * @param parent
     */
    public static void setTypeface(Typeface typeface, ViewGroup parent) {
        for (int i = 0; i < parent.getChildCount(); i++) {
            View v = parent.getChildAt(i);
            if (v instanceof ViewGroup) {
                setTypeface(typeface, (ViewGroup) v);
            } else if (v instanceof TextView) {
                TextView tv = (TextView) v;
                if (DO_SUBPIXEL_RENDERING) {
                    tv.setPaintFlags(tv.getPaintFlags()
                            | Paint.SUBPIXEL_TEXT_FLAG);
                }
                tv.setTypeface(typeface);
            }
        }
    }

    /**
     * @param typeface
     * @param views
     * @see ViewUtil#setTypeface(android.graphics.Typeface, android.view.ViewGroup)
     * <p/>
     * Sets the type face for n-views, but NOT for their children.
     */
    public static void setTypeface(Typeface typeface, TextView... views) {
        for (TextView view : views) {
            view.setTypeface(typeface);
            if (DO_SUBPIXEL_RENDERING) {
                System.out.println("do subpixel rendering");
                view.setPaintFlags(view.getPaintFlags()
                        | Paint.SUBPIXEL_TEXT_FLAG);
            }
        }
    }

    public static void setSubpixelRendering(boolean enabled) {
        DO_SUBPIXEL_RENDERING = enabled;
    }
}