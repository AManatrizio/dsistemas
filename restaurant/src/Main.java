import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // platos
        Plato milanesa = new Plato("Milanesa");
        Plato pizza    = new Plato("Pizza");
        Plato risotto  = new Plato("Risotto");

        // restaurantes
        Restaurante r1 = new Restaurante("La Esquina");
        r1.agregarPlato(milanesa);
        r1.agregarPlato(pizza);

        Restaurante r2 = new Restaurante("Don Mario");
        r2.agregarPlato(pizza);
        r2.agregarPlato(risotto);

        // sucursales (opcional, solo para mostrar que existen)
        new Sucursal("San Martín 1200", r1);
        new Sucursal("Arístides 300", r1);
        new Sucursal("Colón 250", r2);

        // personas
        Persona ana = new Persona("Ana");
        Persona bruno = new Persona("Bruno");

        // frecuencias (habitué)
        ana.agregarFrecuente(r1);
        bruno.agregarFrecuente(r1);
        bruno.agregarFrecuente(r2);

        // gustos (plato + restaurante)
        ana.agregarGusto(r1, milanesa); // le gusta la milanesa de r1
        ana.agregarGusto(r2, pizza);    // le gusta la pizza de r2

        bruno.agregarGusto(r1, pizza);  // le gusta la pizza de r1
        // bruno NO pone gusto de risotto en ningún restaurante → permite el caso "plato no le gusta a nadie"

        // demo de consultas
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(ana); personas.add(bruno);

        System.out.println("¿A quiénes les gusta la Pizza en La Esquina?");
        for (Persona p : ConsultasRestaurantes.personasQueGustanDe(pizza, r1, personas)) {
            System.out.println(" - " + p.getNombre());
        }

        System.out.println("\nPlatos que le gustan a Ana en Don Mario:");
        for (Plato p : ConsultasRestaurantes.platosQueLeGustanEn(ana, r2)) {
            System.out.println(" - " + p.getNombre());
        }
    }
}