// apunte: datos de visitante para estancias y excursiones
public class Visitante {
    private String dni, nombre, direccion, profesion;

    public Visitante(String dni, String nombre, String direccion, String profesion) {
        this.dni = dni; this.nombre = nombre; this.direccion = direccion; this.profesion = profesion;
    }
    public String getNombre() { return nombre; }
}