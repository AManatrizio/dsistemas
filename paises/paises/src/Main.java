public class Main {
    public static void main(String[] args) {
        // Ciudades
        Ciudad mendozaCap = new Ciudad("Mendoza", 1150000);
        Ciudad godoyCruz  = new Ciudad("Godoy Cruz", 200000);

        // Provincia
        Provincia mendoza = new Provincia("Mendoza");
        mendoza.setCapital(mendozaCap);
        mendoza.setCiudades(mendozaCap);
        mendoza.setCiudades(godoyCruz);

        // País
        Pais argentina = new Pais("Argentina");
        argentina.setCapital(new Ciudad("Ciudad Autónoma de Buenos Aires", 3000000));
        argentina.setProvincias(mendoza);

        Pais chile = new Pais("Chile");
        chile.setCapital(new Ciudad("Santiago", 6000000));

        // Limítrofes
        argentina.setLimitrofe(chile);
        chile.setLimitrofe(argentina);

        // Continente
        Continente americaSur = new Continente("América del Sur");
        americaSur.setPaises(argentina);
        americaSur.setPaises(chile);

        // Salida de prueba
        System.out.println("Continente: " + americaSur.getNombre());
        for (int i = 0; i < americaSur.cantidadPaises(); i++) {
            Pais p = americaSur.getPaises(i);
            System.out.println("- País: " + p.getNombre() + " | Capital: " + p.getCapital().getNombre());
        }

        System.out.println("\nProvincia de " + argentina.getNombre() + ": " + argentina.getProvincias(0).getNombre());
        System.out.println("Capital provincial: " + argentina.getProvincias(0).getCapital().getNombre());
        System.out.println("Ciudades en Mendoza:");
        Provincia prov = argentina.getProvincias(0);
        for (int i = 0; i < prov.cantidadCiudades(); i++) {
            System.out.println("  * " + prov.getCiudades(i).getNombre());
        }

        System.out.println("\nPaíses limítrofes de " + argentina.getNombre() + ": " + argentina.getLimitrofe(0).getNombre());
    }
}