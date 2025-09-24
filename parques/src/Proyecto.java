import java.util.ArrayList;

public class Proyecto {
    private String nombre;
    private double presupuesto;
    private String inicio, fin;
    private ArrayList<ParticipacionInvestigacion> participaciones = new ArrayList<>();

    public Proyecto(String nombre, double presupuesto, String inicio, String fin) {
        this.nombre = nombre; this.presupuesto = presupuesto; this.inicio = inicio; this.fin = fin;
    }

    public void agregarParticipacion(ParticipacionInvestigacion pi) { participaciones.add(pi); }
}