public class Celador extends Empleado {
    private Entrada entrada; // destino

    public Celador(String dni, String nombre, Parque parque, Entrada entrada) {
        super(dni, nombre, parque);
        this.entrada = entrada;
    }
}