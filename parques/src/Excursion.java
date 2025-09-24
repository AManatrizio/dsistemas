import java.util.ArrayList;

// apunte: excursión organizada por uno o más alojamientos; visitantes inscriptos
public class Excursion {
    private String codigo;
    private String dia;
    private String hora;
    private Parque parque;

    private ArrayList<Alojamiento> organizadores = new ArrayList<>();
    private ArrayList<Visitante> inscriptos = new ArrayList<>();

    public Excursion(String codigo, String dia, String hora, Parque parque) {
        this.codigo = codigo; this.dia = dia; this.hora = hora; this.parque = parque;
        if (parque != null) parque.agregarExcursion(this);
    }

    public void agregarOrganizador(Alojamiento a) { organizadores.add(a); }
    public void inscribir(Visitante v) { inscriptos.add(v); }
}