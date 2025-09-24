// apunte: base para Celador/Guarda/Investigador
public abstract class Empleado {
    protected String dni, nombre, direccion, telefono, nss;
    protected double sueldo;
    protected Parque parque;

    public Empleado(String dni, String nombre, Parque parque) {
        this.dni = dni;
        this.nombre = nombre;
        this.parque = parque;
        if (parque != null) parque.agregarEmpleado(this);
    }

    // === getters mínimos ===
    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    public double getSueldo() { return sueldo; }
}