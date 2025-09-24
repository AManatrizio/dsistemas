import java.util.ArrayList;

// apunte: CA con su organismo y la lista de parques que abarca (N:M)
public class ComunidadAutonoma {
    private String nombre;
    private String organismoResponsable;
    private ArrayList<Parque> parques = new ArrayList<>();

    public ComunidadAutonoma(String nombre, String organismoResponsable) {
        this.nombre = nombre; this.organismoResponsable = organismoResponsable;
    }
    public String getNombre() { return nombre; }
    public String getOrganismoResponsable() { return organismoResponsable; }

    public void agregarParque(Parque p) { parques.add(p); }
    public Parque getParque(int i) { return parques.get(i); }
    public int cantidadParques() { return parques.size(); }
}