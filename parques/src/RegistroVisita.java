public class RegistroVisita {
    private Visitante visitante;
    private Entrada entrada;
    private String fecha;

    public RegistroVisita(Visitante v, Entrada e, String fecha) {
        this.visitante = v; this.entrada = e; this.fecha = fecha;
    }
}