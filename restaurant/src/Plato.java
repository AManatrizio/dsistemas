// apunte: plato genérico (no depende de un restaurante)
public class Plato {
    private String nombre;

    public Plato(String nombre) { this.nombre = nombre; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    @Override public String toString() { return nombre; }
}