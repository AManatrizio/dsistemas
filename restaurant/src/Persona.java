import java.util.ArrayList;

// apunte: una persona tiene restaurantes "frecuentes" (habitué)
// pero puede ir a otros (ocasional) → eso no lo bloqueo en el modelo
// además, guardo sus "me gusta (plato, restaurante)" como Preferencias
public class Persona {
    private String nombre;
    private ArrayList<Restaurante> frecuentes = new ArrayList<>();
    private ArrayList<Preferencia> gustos = new ArrayList<>();

    public Persona(String nombre) { this.nombre = nombre; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    // frecuencias (lista abierta, no exclusiva)
    public void agregarFrecuente(Restaurante r) { frecuentes.add(r); }
    public Restaurante getFrecuente(int i) { return frecuentes.get(i); }
    public int cantidadFrecuentes() { return frecuentes.size(); }
    public ArrayList<Restaurante> getFrecuentes() { return frecuentes; }

    // "me gusta este plato en este restaurante"
    public void agregarGusto(Restaurante r, Plato p) {
        gustos.add(new Preferencia(this, r, p));
    }
    public Preferencia getGusto(int i) { return gustos.get(i); }
    public int cantidadGustos() { return gustos.size(); }
    public ArrayList<Preferencia> getGustos() { return gustos; }
}