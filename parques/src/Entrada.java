import java.util.ArrayList;

public class Entrada {
    private int numero;              // 1..N dentro del parque
    private Parque parque;
    private ArrayList<RegistroVisita> registros = new ArrayList<>();

    public Entrada(int numero, Parque parque) {
        this.numero = numero; this.parque = parque;
        if (parque != null) parque.agregarEntrada(this);
    }

    public void registrarVisita(Visitante v, String fecha) {
        registros.add(new RegistroVisita(v, this, fecha));
    }
}