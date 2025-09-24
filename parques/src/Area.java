import java.util.ArrayList;

// apunte: Área del parque (nombre único dentro del parque) + km2
public class Area {
    private String nombre;
    private double km2;
    // poblaciones (especie, individuos)
    private ArrayList<PoblacionArea> poblaciones = new ArrayList<>();

    public Area(String nombre, double km2) { this.nombre = nombre; this.km2 = km2; }
    public String getNombre() { return nombre; }

    public void agregarPoblacion(PoblacionArea pa) { poblaciones.add(pa); }
}