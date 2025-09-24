public class EspecieVegetal extends Especie {
    // apunte: floración opcional
    private boolean tieneFloracion;
    private String periodoFloracion;

    public EspecieVegetal(String cient, String vulgar, boolean flor, String periodo) {
        super(cient, vulgar);
        this.tieneFloracion = flor; this.periodoFloracion = periodo;
    }
}