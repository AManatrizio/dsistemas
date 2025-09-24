public class Main {
    public static void main(String[] args) {
        // creo algunas ciudades
        Ciudad a = new Ciudad("Ciudad A", 150_000);
        a.setImp1(100); a.setImp2(200); a.setImp3(300); a.setImp4(400); a.setImp5(500);
        a.setGastoMantenimiento(2000); // gasta más que recauda → déficit

        Ciudad b = new Ciudad("Ciudad B", 120_000);
        b.setImp1(500); b.setImp2(500); b.setImp3(500); b.setImp4(500); b.setImp5(500); // total 2500
        b.setGastoMantenimiento(3000); // B también en déficit


        Ciudad c = new Ciudad("Ciudad C", 90_000); // menos de 100k → no entra al control
        c.setImp1(1000); c.setImp2(1000); c.setImp3(1000); c.setImp4(1000); c.setImp5(1000);
        c.setGastoMantenimiento(6000);

        // provincia con esas ciudades
        Provincia prov = new Provincia("Mendoza");
        prov.setCiudades(a);
        prov.setCiudades(b);
        prov.setCiudades(c);

        // país con esa provincia
        Pais pais = new Pais("Argentina");
        pais.setProvincias(prov);

        // pruebas
        System.out.println("Ciudades en déficit:");
        for (Ciudad x : pais.ciudadesQueGastanMasDeLoQueRecaudan()) {
            System.out.println(" - " + x.getNombre());
        }

        System.out.println("\nProvincias con más de la mitad de ciudades en déficit:");
        for (Provincia p : pais.provinciasConMasDeLaMitadEnDeficit()) {
            System.out.println(" - " + p.getNombre());
        }
    }
}