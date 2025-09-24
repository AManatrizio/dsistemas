public class Main {
    public static void main(String[] args) {
        // ===== Comunidades y Parques
        ComunidadAutonoma ca1 = new ComunidadAutonoma("Andalucía", "Consejería de Medio Ambiente");
        Parque p1 = new Parque("Sierra Nevada", "1999-05-10");
        ca1.agregarParque(p1);

        // ===== Áreas y especies
        Area area1 = new Area("Laguna Grande", 15.5);
        Area area2 = new Area("Borreguiles", 22.3);
        p1.agregarArea(area1);
        p1.agregarArea(area2);

        // especies vegetales
        EspecieVegetal eV1 = new EspecieVegetal("Quercus ilex", "Encina", true, "Primavera");
        EspecieVegetal eV2 = new EspecieVegetal("Poa pratensis", "Pasto", false, "");

        // especie animal
        EspecieAnimal eA1 = new EspecieAnimal("Capra pyrenaica", "Cabra montés", "Otoño", Dieta.HERBIVORA);
        eA1.agregarAlimento(eV2); // se alimenta de pasto

        // poblaciones en áreas
        PoblacionArea pa1 = new PoblacionArea(area1, eV1, 120);
        PoblacionArea pa2 = new PoblacionArea(area1, eA1, 35);
        area1.agregarPoblacion(pa1);
        area1.agregarPoblacion(pa2);

        // ===== Visitantes, alojamientos y estancias
        Visitante v1 = new Visitante("123A", "Ana López", "C/ Granada 10", "Bióloga");
        Visitante v2 = new Visitante("456B", "Carlos Pérez", "C/ Málaga 5", "Profesor");

        Alojamiento al1 = new Alojamiento("Refugio Universitario", 30, "Albergue", p1);
        Estancia est1 = new Estancia(v1, al1, "101", "2025-07-01", "2025-07-07");
        Estancia est2 = new Estancia(v2, al1, "102", "2025-07-02", "2025-07-05");

        // ===== Excursiones
        Excursion ex1 = new Excursion("EX-001", "2025-07-03", "09:00", p1);
        ex1.agregarOrganizador(al1);
        ex1.inscribir(v1);
        ex1.inscribir(v2);

        // ===== Entradas, celadores y registros
        Entrada entrada1 = new Entrada(1, p1);
        Celador c1 = new Celador("111C", "Pedro Celador", p1, entrada1);
        entrada1.registrarVisita(v1, "2025-07-01");
        entrada1.registrarVisita(v2, "2025-07-02");

        // ===== Guardas y vehículos
        Vehiculo jeep = new Vehiculo("Jeep 4x4", "1234-ABC");
        Guarda g1 = new Guarda("222G", "Laura Guarda", p1, area1, jeep);

        // ===== Investigadores y proyectos
        Investigador inv1 = new Investigador("333I", "María Investigadora", p1, "Lic. Biología");
        Proyecto proj1 = new Proyecto("Estudio Cabra Montés", 50000, "2025-06-01", "2025-12-01");
        ParticipacionInvestigacion partInv = new ParticipacionInvestigacion(inv1, proj1, eA1);

        // ===== Mostrar info resumida
        System.out.println("Comunidad: " + ca1.getNombre());
        System.out.println("Parque: " + p1.getNombre());
        System.out.println("Áreas: ");
        System.out.println(" - " + area1.getNombre() + " (" + pa1 + ", " + pa2 + ")");
        System.out.println("Visitantes en alojamiento " + al1.getNombre() + ":");
        System.out.println(" - " + v1.getNombre() + " en habitación 101");
        System.out.println(" - " + v2.getNombre() + " en habitación 102");
        System.out.println("Excursión " + ex1 + " con inscriptos: " + v1.getNombre() + ", " + v2.getNombre());
        System.out.println("Celador " + c1.getNombre() + " registró entradas en " + entrada1);
        System.out.println("Guarda " + g1.getNombre() + " patrulla área " + area1.getNombre() + " en vehículo Jeep");
        System.out.println("Investigador " + inv1.getNombre() + " participa en proyecto " + proj1 + " sobre " + eA1.getNombreVulgar());
    }
}