import java.util.ArrayList;

// Apunte: cereal con nombre, tipo (gruesa/fina/pastura) y lista de minerales que necesita
//   - para sembrar: el lote debe tener todos los minerales requeridos
//   - si es PASTURA: además, el lote no puede haber tenido otra pastura antes

public class Cereal {
    public enum Tipo { GRUESA, FINA, PASTURA }

    private String nombre;
    private Tipo tipo;
    private ArrayList<String> mineralesRequeridos = new ArrayList<>();

    public Cereal(String nombre, Tipo tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() { return nombre; }
    public Tipo getTipo() { return tipo; }

    // agregar un mineral requerido por nombre (mantengo simple: comparo por nombre)
    public void addMineralRequerido(String mineral) { mineralesRequeridos.add(mineral); }
    public String getMineralRequerido(int i) { return mineralesRequeridos.get(i); }
    public int cantidadMineralesRequeridos() { return mineralesRequeridos.size(); }
}