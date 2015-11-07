package ar.gob.anses.procrear.preciosdereferencia.db;

import java.math.BigDecimal;

import ar.gob.anses.procrear.preciosdereferencia.R;
import ar.gob.anses.procrear.preciosdereferencia.dto.Producto;
import ar.gob.anses.procrear.preciosdereferencia.dto.Proveedor;

/**
 * A list of all the productos we have available.
 */
public final class ProductoList {

    /**
     * This class should not be instantiated.
     */
    private ProductoList() {
    }

    public static final Producto[] PRODUCTOS = {

            // HIERROS
            new Producto("", "Hierro aletado Ø 4mm", "Barra x 12m", "Acero ADN A-420 4mm", new BigDecimal(15.56), new Proveedor("Acindar/CDSA", R.drawable.logo_proveedor_acindar)),
            new Producto("", "Hierro aletado Ø 6 mm", "Barra x 12m", "Acero ADN A-420 6mm", new BigDecimal(33.91), new Proveedor("Acindar/CDSA", R.drawable.logo_proveedor_acindar)),
            new Producto("", "Hierro aletado Ø 8 mm", "Barra x 12m", "Acero ADN A-420 8mm", new BigDecimal(60.57), new Proveedor("Acindar/CDSA", R.drawable.logo_proveedor_acindar)),
            new Producto("", "Hierro aletado Ø 10 mm", "Barra x 12m", "Acero ADN A-420 10mm", new BigDecimal(94.56), new Proveedor("Acindar/CDSA", R.drawable.logo_proveedor_acindar)),
            new Producto("", "Hierro aletado Ø 12 mm", "Barra x 12m", "Acero ADN A-420 12mm", new BigDecimal(136.42), new Proveedor("Acindar/CDSA", R.drawable.logo_proveedor_acindar)),

            // PLACAS DE YESO
            new Producto("", "Placa de roca de yeso 12,5mm", "Placa de 1,20 m. x 2,40 m.", "", new BigDecimal(80.52), new Proveedor("Durlock", R.drawable.logo_proveedor_durlock)),
            new Producto("", "Placa de roca de yeso 9,5mm", "Placa de 1,20 m. x 2,40 m.", "", new BigDecimal(77.44), new Proveedor("Durlock", R.drawable.logo_proveedor_durlock)),
            new Producto("7798160283823", "Placa de roca de yeso 12,5 mm", "Placa de 1,20 m. x 2,40 m.", "", new BigDecimal(79.83), new Proveedor("Knauf", R.drawable.logo_proveedor_knauf)),
            new Producto("7798160283847", "Placa de roca de yeso 9,5 mm", "Placa de 1,20 m. x 2,40 m.", "", new BigDecimal(76.89), new Proveedor("Knauf", R.drawable.logo_proveedor_knauf)),

            // PINTURAS
            new Producto("7790715562919", "Látex impermeable exterior", "lata x 20 lts", "Colorín Thermocontrol impermeabilizante antideslizante", new BigDecimal(801.61), new Proveedor("Colorín", R.drawable.logo_proveedor_colorin)),
            new Producto("7790715555669", "Látex para interiores blanco 1ra calidad", "lata x 20 lts", "Colorín Neocryl latex interior mate", new BigDecimal(734.28), new Proveedor("Colorín", R.drawable.logo_proveedor_colorin)),
            new Producto("7790715557618", "Látex para interiores blanco 2da calidad", "lata x 20 lts", "Colorín Titanio latex interior y exterior", new BigDecimal(558.66), new Proveedor("Colorín", R.drawable.logo_proveedor_colorin)),
            new Producto("7791419026509", "Látex impermeable exterior", "lata x 20 lts", "Plavipint Frentes Blanco", new BigDecimal(611.54), new Proveedor("Plavicon", R.drawable.logo_proveedor_plavicon)),
            new Producto("7791419257958", "Látex para interiores blanco 1ra calidad", "lata x 20 lts", "Pincelar látex interior/exterior. Profesional Mate", new BigDecimal(558.07), new Proveedor("Plavicon", R.drawable.logo_proveedor_plavicon)),
            new Producto("7791419026424", "Látex para interiores blanco 2da calidad", "lata x 20 lts", "Plavipint látex interior mate", new BigDecimal(546.90), new Proveedor("Plavicon", R.drawable.logo_proveedor_plavicon)),
            new Producto("7793080139205", "Látex impermeable exterior", "lata x 20 lts", "Sherwin Williams Z-10 Exterior", new BigDecimal(749.14), new Proveedor("Sherwin Williams", R.drawable.logo_proveedor_sherwin_williams)),
            new Producto("7793080140201", "Látex para interiores blanco 1ra calidad", "lata x 20 lts", "Sherwin Williams Z-10 Interior", new BigDecimal(769.24), new Proveedor("Sherwin Williams", R.drawable.logo_proveedor_sherwin_williams)),
            new Producto("7793080103985", "Látex para interiores blanco 2da calidad", "lata x 20 lts", "Sherwin Williams Nueva Construcción", new BigDecimal(420.49), new Proveedor("Sherwin Williams", R.drawable.logo_proveedor_sherwin_williams)),
            new Producto("7793080366311", "Látex para interiores blanco 2da calidad", "lata x 20 lts", "Sherwin Williams Weekend", new BigDecimal(420.49), new Proveedor("Sherwin Williams", R.drawable.logo_proveedor_sherwin_williams)),
            new Producto("7793080201582", "Látex para interiores  blanco 1ra calidad", "lata x 20 lts", "Sherwin Williams Country Loft Interior", new BigDecimal(769.24), new Proveedor("Sherwin Williams", R.drawable.logo_proveedor_sherwin_williams)),
            new Producto("7793080201544", "Látex impermeable exterior", "lata x 20 lts", "Sherwin Williams Country Loft Exterior", new BigDecimal(749.14), new Proveedor("Sherwin Williams", R.drawable.logo_proveedor_sherwin_williams)),
            new Producto("7796374088883", "Látex impermeable exterior", "lata x 20 lts", "Albafrent frentes y muros", new BigDecimal(701.96), new Proveedor("ALBA", R.drawable.logo_proveedor_alba)),
            new Producto("7796374004531", "Látex para interiores blanco 1ra calidad", "lata x 20 lts", "Albamax", new BigDecimal(578.26), new Proveedor("ALBA", R.drawable.logo_proveedor_alba)),
            new Producto("7796374847565", "Látex para interiores blanco 2da calidad", "lata x 20 lts", "Alba hogar interior/exterior", new BigDecimal(399.47), new Proveedor("ALBA", R.drawable.logo_proveedor_alba)),
            new Producto("7796374853450", "Látex para interiores blanco 2da calidad", "lata x 20 lts", "Decoralba profesional", new BigDecimal(399.46), new Proveedor("ALBA", R.drawable.logo_proveedor_alba)),
            new Producto("7792952019058", "Látex impermeable exterior", "lata x 20 lts", "Membrana líquida profesional frente impermeabilizante", new BigDecimal(758.68), new Proveedor("Sinteplast", R.drawable.logo_proveedor_sinteplast)),
            new Producto("7792951035233", "Látex para interiores blanco 1ra calidad", "lata x 20 lts", "Casablanca classic interior blanco", new BigDecimal(840.06), new Proveedor("Sinteplast", R.drawable.logo_proveedor_sinteplast)),
            new Producto("7792952010123", "Látex para interiores blanco 2da calidad", "lata x 20 lts", "Sinteplast KING interior blanco", new BigDecimal(461.80), new Proveedor("Sinteplast", R.drawable.logo_proveedor_sinteplast)),
            new Producto("7792261021537", "Látex impermeable exterior", "envase x 25 kg", "Embellecer Venier Frentes Impermeabilizante", new BigDecimal(587.85), new Proveedor("Venier", R.drawable.logo_proveedor_venier)),
            new Producto("7792261013549", "Látex para interiores blanco 1ra calidad", "envase x 25 kg", "Látex Interior Certificado INTI", new BigDecimal(637.31), new Proveedor("Venier", R.drawable.logo_proveedor_venier)),
            new Producto("7792261007432", "Látex para interiores blanco 2da calidad", "envase x 20 lts", "Látex Interior 2022-Plus", new BigDecimal(401.69), new Proveedor("Venier", R.drawable.logo_proveedor_venier)),

            // CALES Y CEMENTOS
            new Producto("7798042430147", "Cal común", "Bolsa x 25 kg.", "Hidrat Extra", new BigDecimal(31.60), new Proveedor("Cementos Avellaneda", R.drawable.logo_proveedor_cementos_avellaneda)),
            new Producto("7798042430345", "Cemento de albañilería", "Bolsa x 40 kg.", "Hidralit", new BigDecimal(47.77), new Proveedor("Cementos Avellaneda", R.drawable.logo_proveedor_cementos_avellaneda)),
            new Producto("7798042430208", "Cemento portland Fillerizado (CPF40)", "Bolsa x 50 kg", "Fillerizado CPF 40", new BigDecimal(77.59), new Proveedor("Cementos Avellaneda", R.drawable.logo_proveedor_cementos_avellaneda)),
            new Producto("7798075260124", "Cal hidraúlica", "Bolsa x 20 kg.", "Cacique Plus", new BigDecimal(25.21), new Proveedor("Loma Negra", R.drawable.logo_proveedor_loma_negra)),
            new Producto("7798075260117", "Cal aérea", "Bolsa x 20 kg.", "Loma Negra Plus", new BigDecimal(41.25), new Proveedor("Loma Negra", R.drawable.logo_proveedor_loma_negra)),
            new Producto("7798075260131", "Cemento de albañilería", "Bolsa x 40 kg.", "Plasticor", new BigDecimal(46.50), new Proveedor("Loma Negra", R.drawable.logo_proveedor_loma_negra)),
            new Producto("7798075260018", "Cemento portland compuesto", "Bolsa x 50 kg", "CPC 40", new BigDecimal(77.64), new Proveedor("Loma Negra", R.drawable.logo_proveedor_loma_negra)),
            new Producto("7798110330256", "Cemento de albañilería", "Bolsa x 40 kg.", "Holcim Hercal", new BigDecimal(47.63), new Proveedor("Holcim", R.drawable.logo_proveedor_holcim)),
            new Producto("7798110330270", "Cemento portland compuesto", "Bolsa x 50 kg", "Holcim Fuerte", new BigDecimal(74.34), new Proveedor("Holcim", R.drawable.logo_proveedor_holcim)),

            // SELLADORES
            new Producto("7794671217463", "Sellador Acrílico 300 gr", "Unidad", "Sika", new BigDecimal(24.02), new Proveedor("Sika", R.drawable.logo_proveedor_sika)),

            // LADRILLOS
            new Producto("2000001087374", "Ladrillo hueco cerámico 12 x 18 x 33 de 6 TUBOS", "Unidad", "", new BigDecimal(5.51), new Proveedor("Cerámica Fanelli", R.drawable.logo_proveedor_ceramica_fanelli)),
            new Producto("2000001088876", "Ladrillo hueco cerámico 18 x 18 x 33", "Unidad", "", new BigDecimal(9.08), new Proveedor("Cerámica Fanelli", R.drawable.logo_proveedor_ceramica_fanelli)),
            new Producto("2000001087367", "Ladrillo hueco cerámico 8 x 18 x 33", "Unidad", "", new BigDecimal(4.60), new Proveedor("Cerámica Fanelli", R.drawable.logo_proveedor_ceramica_fanelli)),
            new Producto("2000001087381", "Ladrillo hueco cerámico portante 12 x 19 x 33", "Unidad", "", new BigDecimal(9.38), new Proveedor("Cerámica Fanelli", R.drawable.logo_proveedor_ceramica_fanelli)),
            new Producto("2000001088906", "Ladrillo hueco cerámico portante 18 x 19 x 33", "Unidad", "", new BigDecimal(11.46), new Proveedor("Cerámica Fanelli", R.drawable.logo_proveedor_ceramica_fanelli)),
            new Producto("2000001088913", "Ladrillones para techo (tipo Sapo) 11 x 38 x 25 cerámico", "Unidad", "", new BigDecimal(12.64), new Proveedor("Cerámica Fanelli", R.drawable.logo_proveedor_ceramica_fanelli)),
            new Producto("2000001087992", "Ladrillo hueco cerámico 12 x 18 x 33 DE 9 TUBOS", "Unidad", "", new BigDecimal(5.98), new Proveedor("Cerámica Fanelli", R.drawable.logo_proveedor_ceramica_fanelli)),
            new Producto("2000001087374", "Ladrillo hueco cerámico 12 x 18 x 33 de 6 TUBOS", "Unidad", "", new BigDecimal(5.51), new Proveedor("Later-Cer", R.drawable.logo_proveedor_later_cer)),
            new Producto("2000001088876", "Ladrillo hueco cerámico 18 x 18 x 33", "Unidad", "", new BigDecimal(9.08), new Proveedor("Later-Cer", R.drawable.logo_proveedor_later_cer)),
            new Producto("2000001087367", "Ladrillo hueco cerámico 8 x 18 x 33", "Unidad", "", new BigDecimal(4.60), new Proveedor("Later-Cer", R.drawable.logo_proveedor_later_cer)),
            new Producto("2000001087381", "Ladrillo hueco cerámico portante 12 x 19 x 33", "Unidad", "", new BigDecimal(9.38), new Proveedor("Later-Cer", R.drawable.logo_proveedor_later_cer)),
            new Producto("2000001088906", "Ladrillo hueco cerámico portante 18 x 19 x 33", "Unidad", "", new BigDecimal(11.46), new Proveedor("Later-Cer", R.drawable.logo_proveedor_later_cer)),
            new Producto("2000001088913", "Ladrillones para techo (tipo Sapo) 11 x 38 x 25 cerámico", "Unidad", "", new BigDecimal(12.64), new Proveedor("Later-Cer", R.drawable.logo_proveedor_later_cer)),
            new Producto("2000001087992", "Ladrillo hueco cerámico 12 x 18 x 33 DE 9 TUBOS", "Unidad", "", new BigDecimal(5.98), new Proveedor("Later-Cer", R.drawable.logo_proveedor_later_cer)),

            // SANITARIOS
            new Producto("7791015027658", "Inodoro Mónaco-N Plus apoyo blanco", "Unidad", "Roca", new BigDecimal(1052.94), new Proveedor("Roca", R.drawable.logo_proveedor_roca)),
            new Producto("7791015027665", "Depósito Mónaco-N Plus apoyo blanco", "Unidad", "Roca", new BigDecimal(966.13), new Proveedor("Roca", R.drawable.logo_proveedor_roca)),
            new Producto("7791015027689", "Bidé Mónaco-N Plus 3ag ll blanco", "Unidad", "Roca", new BigDecimal(731.43), new Proveedor("Roca", R.drawable.logo_proveedor_roca)),
            new Producto("7793577142565", "Inodoro Largo con Tapa Asiento Línea Murano", "Unidad", "Ferrum", new BigDecimal(2140.02), new Proveedor("Ferrum", R.drawable.logo_proveedor_ferrum)),
            new Producto("7793577142350", "Inodoro Largo Línea Murano", "Unidad", "Ferrum", new BigDecimal(1755.47), new Proveedor("Ferrum", R.drawable.logo_proveedor_ferrum)),
            new Producto("7793577154926", "Tapa Asiento Línea Murano", "Unidad", "Ferrum", new BigDecimal(384.55), new Proveedor("Ferrum", R.drawable.logo_proveedor_ferrum)),
            new Producto("7793577169746", "Depósito de Apoyar para Inodoro Línea Murano", "Unidad", "Ferrum", new BigDecimal(1637.07), new Proveedor("Ferrum", R.drawable.logo_proveedor_ferrum)),
            new Producto("7793577142275", "Bidet de 3 Agujeros Línea Murano", "Unidad", "Ferrum", new BigDecimal(1588.44), new Proveedor("Ferrum", R.drawable.logo_proveedor_ferrum)),

            // CHAPAS
            new Producto("", "Chapa ondulada (aleación aluminio-zinc) ancho útil 1mt. Nº 25", "ml", "Siderar/RACH", new BigDecimal(110.83), new Proveedor("Siderar/RACH", R.drawable.logo_proveedor_ternium_siderar)),
            new Producto("", "Chapa ondulada (aleación aluminio-zinc) ancho útil 1mt. Nº 27", "ml", "Siderar/RACH", new BigDecimal(97.63), new Proveedor("Siderar/RACH", R.drawable.logo_proveedor_ternium_siderar)),
            new Producto("", "Chapa trapezoidal (aleación aluminio-zinc) ancho útil 1mt. Nº 27 T101-C27", "ml", "Siderar/RACH", new BigDecimal(97.63), new Proveedor("Siderar/RACH", R.drawable.logo_proveedor_ternium_siderar)),

            // BLOQUES DE HORMIGÓN
            new Producto("", "Bloque de Hormigón 19X19X39 Modelo FT20 standard", "Unidad", "", new BigDecimal(13.19), new Proveedor("Fenoblock", R.drawable.logo_proveedor_fenoblock)),

            // AISLANTES
            new Producto("7798078380096", "Bajo Teja Hidrorrepelente Hc", "M2", "Isover", new BigDecimal(33.64), new Proveedor("Isover", R.drawable.logo_proveedor_isover)),
            new Producto("7798078389563", "Rolac Plata Cubierta Hidrorrepelente Hc", "M2", "Isover", new BigDecimal(78.31), new Proveedor("Isover", R.drawable.logo_proveedor_isover)),

            // CERÁMICAS
            new Producto("7796128006606", "Piedra Rohen 36x36", "M2", "Allpa", new BigDecimal(66.77), new Proveedor("Cerámica Alberdi", R.drawable.logo_proveedor_ceramica_alberdi)),
            new Producto("7796128006705", "Atenas Gris 36x36", "M2", "Allpa", new BigDecimal(64.15), new Proveedor("Cerámica Alberdi", R.drawable.logo_proveedor_ceramica_alberdi)),
            new Producto("7796128006804", "Atenas Beige 36x36", "M2", "Allpa", new BigDecimal(64.16), new Proveedor("Cerámica Alberdi", R.drawable.logo_proveedor_ceramica_alberdi)),
            new Producto("7796128006903", "Melincue 50x50", "M2", "Alberdi", new BigDecimal(107.01), new Proveedor("Cerámica Alberdi", R.drawable.logo_proveedor_ceramica_alberdi)),
            new Producto("7796128007207", "Piso pared Pireo 32x60", "M2", "Alberdi", new BigDecimal(107.01), new Proveedor("Cerámica Alberdi", R.drawable.logo_proveedor_ceramica_alberdi)),
            new Producto("7796128007306", "Porcellanato Kansas 45x45", "M2", "Paz", new BigDecimal(151.40), new Proveedor("Cerámica Alberdi", R.drawable.logo_proveedor_ceramica_alberdi)),
            new Producto("7791300069936", "San Marino Arena 33,5X33,5", "M2", "Cerámica San Lorenzo", new BigDecimal(74.39), new Proveedor("Cerámica San Lorenzo", R.drawable.logo_proveedor_san_lorenzo)),
            new Producto("7791300069967", "San Marino Marfil 33,5X33,5", "M2", "Cerámica San Lorenzo", new BigDecimal(74.39), new Proveedor("Cerámica San Lorenzo", R.drawable.logo_proveedor_san_lorenzo)),
            new Producto("7798153637664", "38 X 38 Brasilia Marfil", "M2", "Cerro Negro", new BigDecimal(67.82), new Proveedor("Cerro Negro", R.drawable.logo_proveedor_cerro_negro_ceramicas)),
            new Producto("7798153637534", "38 X 38 Rahue", "M2", "Cerro Negro", new BigDecimal(71.38), new Proveedor("Cerro Negro", R.drawable.logo_proveedor_cerro_negro_ceramicas)),
            new Producto("7798153637671", "38 X 38 Cedro Marrón", "M2", "Cerro Negro", new BigDecimal(67.78), new Proveedor("Cerro Negro", R.drawable.logo_proveedor_cerro_negro_ceramicas)),
            new Producto("7798153637589", "38 X 38 Marbella", "M2", "Cerro Negro", new BigDecimal(79.89), new Proveedor("Cerro Negro", R.drawable.logo_proveedor_cerro_negro_ceramicas)),

            // TEJAS
            new Producto("7798074853266", "Teja Romana Natural", "Unidad", "Cerro Negro", new BigDecimal(11.31), new Proveedor("Cerro Negro", R.drawable.logo_proveedor_cerro_negro_ceramicas)),
            new Producto("7798074853396", "Teja Francesa Brillante Calvú", "Unidad", "Cerro Negro", new BigDecimal(14.69), new Proveedor("Cerro Negro", R.drawable.logo_proveedor_cerro_negro_ceramicas)),
            new Producto("7798074853433", "Teja Francesa Esmaltada", "Unidad", "Cerro Negro", new BigDecimal(14.69), new Proveedor("Cerro Negro", R.drawable.logo_proveedor_cerro_negro_ceramicas)),
            new Producto("7798078840316", "Teja Francesa Esmaltada (brillo intenso)", "Unidad", "Losa", new BigDecimal(16.52), new Proveedor("Losa", R.drawable.logo_proveedor_losa_olavarria)),
            new Producto("7798078840354", "Teja Francesa Brillo Natural (esmalte tenue)", "Unidad", "Losa", new BigDecimal(16.22), new Proveedor("Losa", R.drawable.logo_proveedor_losa_olavarria)),

            // HIDRÓFUGOS
            new Producto("7794671001376", "Hidrófugo", "Envase por 10 l", "Sika", new BigDecimal(58.83), new Proveedor("Sika", R.drawable.logo_proveedor_sika)),
            new Producto("7796090150154", "Hidrófugo Ceresita", "20 kg", "Weber", new BigDecimal(165.23), new Proveedor("Weber", R.drawable.logo_proveedor_weber)),

            // IMPERMEABILIZANTES
            new Producto("7796430000019", "Membrana Con Cubierta De Aluminio Emacober Al 4mm", "Rollo 10 M2", "Emapi", new BigDecimal(591.46), new Proveedor("Emapi", R.drawable.logo_proveedor_emapi)),
            new Producto("7796430063519", "Membrana Con Cubierta De Pead N 500 P/P PLUS 43 KG", "Rollo 10 M2", "Emapi", new BigDecimal(397.67), new Proveedor("Emapi", R.drawable.logo_proveedor_emapi)),
            new Producto("7796430089502", "Membrana Con Cubierta De Aluminio Flexible W 300 AL Max 25 KG", "Rollo 10 M2", "Emapi", new BigDecimal(315.74), new Proveedor("Emapi", R.drawable.logo_proveedor_emapi)),
            new Producto("7796430200006", "Impermeabilizante Asfáltico NOVASFALT ANR-5", "Caja 18 Kg", "Emapi", new BigDecimal(159.75), new Proveedor("Emapi", R.drawable.logo_proveedor_emapi)),
            new Producto("7798183250550", "Membrana de Asfalto Plástico Megaflex para impermeabilizaciones no expuestas - MGXNOR400", "35 kg", "Megaflex", new BigDecimal(270.51), new Proveedor("Megaflex", R.drawable.logo_proveedor_megaflex)),

            // YESOS
            new Producto("7796090349039", "Yeso Monocapa manual", "25 kg", "Tuyango", new BigDecimal(79.43), new Proveedor("Tuyango", R.drawable.logo_proveedor_tuyango)),

            // ADHESIVOS PARA CERÁMICOS
            new Producto("7797743000086", "Construkor Impermeable", "Bolsa x 30 kg.", "Klaukol", new BigDecimal(63.21), new Proveedor("Parex Klaukol", R.drawable.logo_proveedor_parex_group)),
            new Producto("7797743040303", "Granidur Impermeable", "Bolsa x 30 Kg", "Klaukol", new BigDecimal(63.21), new Proveedor("Parex Klaukol", R.drawable.logo_proveedor_parex_group)),
            new Producto("7798053731615", "Weber.col Granitex impermeable", "30 kg", "Weber", new BigDecimal(69.59), new Proveedor("Weber", R.drawable.logo_proveedor_weber)),

            // TANQUES
            new Producto("7791018013658", "Tanque Negro Obra 1000 lts", "Unidad", "Eternit", new BigDecimal(1090.78), new Proveedor("Eternit", R.drawable.logo_proveedor_eternit)),
            new Producto("7791018018820", "Tanque Negro Obra 750 lts", "Unidad", "Eternit", new BigDecimal(922.55), new Proveedor("Eternit", R.drawable.logo_proveedor_eternit)),
            new Producto("7798112870026", "Rotoplas Multicapa 600 Litros", "Unidad", "Rotoplas", new BigDecimal(1255.26), new Proveedor("Rotoplas", R.drawable.logo_proveedor_rotoplas)),
            new Producto("7798112870040", "Rotoplas Multicapa 1.100 Litros", "Unidad", "Rotoplas", new BigDecimal(2111.32), new Proveedor("Rotoplas", R.drawable.logo_proveedor_rotoplas)),

            // GRIFERÍAS
            new Producto("7796908002118", "Juego de ducha con transferencia 103/15 CR Línea Allegro", "Unidad", "FV", new BigDecimal(1243.30), new Proveedor("FV", R.drawable.logo_proveedor_fv)),
            new Producto("7796908003825", "Juego de lavatorio 207/15 CR Línea Allegro", "Unidad", "FV", new BigDecimal(1099.09), new Proveedor("FV", R.drawable.logo_proveedor_fv)),
            new Producto("7796908004464", "Juego de bidé 295/15 CR Línea Allegro", "Unidad", "FV", new BigDecimal(1177.37), new Proveedor("FV", R.drawable.logo_proveedor_fv)),
            new Producto("7796908005959", "Juego de cocina 416/15 CR Línea Allegro", "Unidad", "FV", new BigDecimal(1064.06), new Proveedor("FV", R.drawable.logo_proveedor_fv)),
            new Producto("7798102310570", "Grifería de lavatorio \"Cozumel\"", "Unidad", "Grifería Latina", new BigDecimal(729.26), new Proveedor("Grifería Latina", R.drawable.logo_proveedor_gl_griferias)),
            new Producto("7798102310594", "Grifería de bidé \"Cozumel\"", "Unidad", "Grifería Latina", new BigDecimal(772.87), new Proveedor("Grifería Latina", R.drawable.logo_proveedor_gl_griferias)),
            new Producto("7798102310624", "Grifería de cocina mesa \"Cozumel\"", "Unidad", "Grifería Latina", new BigDecimal(531.00), new Proveedor("Grifería Latina", R.drawable.logo_proveedor_gl_griferias)),
            new Producto("7798102310693", "Grifería de ducha de embutir \"Cozumel\"", "Unidad", "Grifería Latina", new BigDecimal(1016.49), new Proveedor("Grifería Latina", R.drawable.logo_proveedor_gl_griferias)),
            new Producto("7798160581189", "Lavatorio Cromo Murcia Plus", "Unidad", "Peirano", new BigDecimal(832.80), new Proveedor("Peirano", R.drawable.logo_proveedor_griferia_peirano)),
            new Producto("7798160581196", "Bidé Cromo Murcia Plus", "Unidad", "Peirano", new BigDecimal(794.35), new Proveedor("Peirano", R.drawable.logo_proveedor_griferia_peirano)),
            new Producto("7798160581202", "Ducha Emb. C/Transf. Cr Murcia Plus", "Unidad", "Peirano", new BigDecimal(1204.47), new Proveedor("Peirano", R.drawable.logo_proveedor_griferia_peirano)),
            new Producto("7798160581219", "Cocina Mesada P/Fundido Murcia Plus", "Unidad", "Peirano", new BigDecimal(945.23), new Proveedor("Peirano", R.drawable.logo_proveedor_griferia_peirano))
    };
}