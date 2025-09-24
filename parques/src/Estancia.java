// apunte: estancia de un visitante en un alojamiento (habitación + fechas)
public class Estancia {
    private Visitante visitante;
    private Alojamiento alojamiento;
    private String habitacion, fechaInicio, fechaFin;

    public Estancia(Visitante v, Alojamiento a, String hab, String ini, String fin) {
        this.visitante = v; this.alojamiento = a; this.habitacion = hab;
        this.fechaInicio = ini; this.fechaFin = fin;
        if (a != null) a.agregarEstancia(this);
    }
}