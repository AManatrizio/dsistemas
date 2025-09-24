public class Investigador extends Empleado {
    private String titulacion;

    public Investigador(String dni, String nombre, Parque parque, String titulacion) {
        super(dni, nombre, parque);
        this.titulacion = titulacion;
    }
}