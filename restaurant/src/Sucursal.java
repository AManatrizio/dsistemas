// apunte: sucursal concreta (dirección) que pertenece a un restaurante
public class Sucursal {
    private String direccion;
    private Restaurante restaurante; // referencia al "madre"

    public Sucursal(String direccion, Restaurante restaurante) {
        this.direccion = direccion;
        this.restaurante = restaurante;
        if (restaurante != null) restaurante.agregarSucursal(this);
    }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public Restaurante getRestaurante() { return restaurante; }
    public void setRestaurante(Restaurante restaurante) { this.restaurante = restaurante; }

    @Override public String toString() { return restaurante.getNombre() + " (" + direccion + ")"; }
}