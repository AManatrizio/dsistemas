import java.util.ArrayList;

public class Provincia {
    private String nombre;
    private Ciudad capital;
    private ArrayList<Ciudad> ciudades = new ArrayList<>();

    public Provincia() { }

    public Provincia(String nombre) {
        this.nombre = nombre;
    }

    // --- básicos
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Ciudad getCapital() { return capital; }
    public void setCapital(Ciudad capital) { this.capital = capital; }

    // --- add y get por índice
    public void setCiudades(Ciudad c) { ciudades.add(c); }   // agrega
    public Ciudad getCiudades(int i) { return ciudades.get(i); }

    // opcional útil
    public int cantidadCiudades() { return ciudades.size(); }
}