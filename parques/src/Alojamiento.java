import java.util.ArrayList;

// apunte: alojamiento propio del parque (nombre único dentro del parque)
public class Alojamiento {
    private String nombre;
    private int capacidad;
    private String categoria;
    private Parque parque;
    private ArrayList<Estancia> estancias = new ArrayList<>();

    public Alojamiento(String nombre, int capacidad, String categoria, Parque parque) {
        this.nombre = nombre; this.capacidad = capacidad; this.categoria = categoria; this.parque = parque;
        if (parque != null) parque.agregarAlojamiento(this);
    }

    public String getNombre() { return nombre; }
    public void agregarEstancia(Estancia e) { estancias.add(e); }
}