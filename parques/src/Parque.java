import java.util.ArrayList;

// apunte: Parque con fecha PN + áreas, alojamientos, entradas, personal
public class Parque {
    private String nombre;
    private String fechaDeclaracionPN;

    private ArrayList<Area> areas = new ArrayList<>();
    private ArrayList<Alojamiento> alojamientos = new ArrayList<>();
    private ArrayList<Entrada> entradas = new ArrayList<>();
    private ArrayList<Empleado> empleados = new ArrayList<>();
    private ArrayList<Excursion> excursiones = new ArrayList<>();

    public Parque(String nombre, String fechaDeclaracionPN) {
        this.nombre = nombre; this.fechaDeclaracionPN = fechaDeclaracionPN;
    }
    public String getNombre() { return nombre; }

    public void agregarArea(Area a) { areas.add(a); }
    public void agregarAlojamiento(Alojamiento a) { alojamientos.add(a); }
    public void agregarEntrada(Entrada e) { entradas.add(e); }
    public void agregarEmpleado(Empleado e) { empleados.add(e); }
    public void agregarExcursion(Excursion ex) { excursiones.add(ex); }
}