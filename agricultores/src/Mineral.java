// Apunte: un mineral tiene nombre y un tipo (primario/secundario)
//   - si el lote tiene al menos un primario => lote "especial"
//   - si tiene solo secundarios => lote "común"
public class Mineral {
    public enum Tipo { PRIMARIO, SECUNDARIO }

    private String nombre;
    private Tipo tipo;

    public Mineral(String nombre, Tipo tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() { return nombre; }
    public Tipo getTipo() { return tipo; }
}
