public class Guarda extends Empleado {
    private Area area;         // área asignada
    private Vehiculo vehiculo; // vehículo asignado

    public Guarda(String dni, String nombre, Parque parque, Area area, Vehiculo vehiculo) {
        super(dni, nombre, parque);
        this.area = area; this.vehiculo = vehiculo;
    }
}