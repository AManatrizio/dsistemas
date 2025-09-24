import java.util.ArrayList;

public class Pais {
    private String nombre;
    private Ciudad capital;
    private ArrayList<Provincia> provincias = new ArrayList<>();
    private ArrayList<Pais> limitrofes = new ArrayList<>();

    public Pais() { }

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    // --- básicos
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Ciudad getCapital() { return capital; }
    public void setCapital(Ciudad capital) { this.capital = capital; }

    // --- add y get por índice
    public void setProvincias(Provincia p) { provincias.add(p); } // agrega
    public Provincia getProvincias(int i) { return provincias.get(i); }

    public void setLimitrofe(Pais p) { limitrofes.add(p); }       // agrega
    public Pais getLimitrofe(int i) { return limitrofes.get(i); }

    // opcionales
    public int cantidadProvincias() { return provincias.size(); }
    public int cantidadLimitrofes() { return limitrofes.size(); }
}