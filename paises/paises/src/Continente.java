import java.util.ArrayList;

public class Continente {
    private String nombre;
    private ArrayList<Pais> paises = new ArrayList<>();
    public Continente() { }

    public Continente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public void setPaises(Pais p) { paises.add(p); }
    public Pais getPaises(int i) { return paises.get(i); }
    public int cantidadPaises() { return paises.size(); }
}