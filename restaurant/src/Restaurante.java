import java.util.ArrayList;

// apunte: restaurante "madre"; puedo tener sucursales que referencian a este
// apunte: el restaurante ofrece hasta 20 platos (lista menú)
public class Restaurante {
    private String nombre;
    private ArrayList<Plato> menu = new ArrayList<>();
    private ArrayList<Sucursal> sucursales = new ArrayList<>();

    public Restaurante(String nombre) { this.nombre = nombre; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    // apunte: agrego plato si no pasé el límite de 20
    public boolean agregarPlato(Plato p) {
        if (menu.size() >= 20) return false; // me sirve para recordar la restricción del enunciado
        menu.add(p);
        return true;
    }

    public Plato getPlato(int i) { return menu.get(i); }
    public int cantidadPlatos() { return menu.size(); }
    public ArrayList<Plato> getMenu() { return menu; }

    // sucursales
    public void agregarSucursal(Sucursal s) { sucursales.add(s); }
    public Sucursal getSucursal(int i) { return sucursales.get(i); }
    public int cantidadSucursales() { return sucursales.size(); }

    @Override public String toString() { return nombre; }
}