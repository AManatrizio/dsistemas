import java.util.ArrayList;

// Apunte: el lote conoce qué minerales tiene y qué cereales se sembraron antes
//   - esEspecial() si tiene al menos 1 mineral PRIMARIO
//   - contieneTodosRequeridos(cereal): chequeo de requisitos
//   - yaTuvoPastura(): regla extra solo para pasturas
public class Lote {
    private String nombre;
    private ArrayList<Mineral> minerales = new ArrayList<>();
    private ArrayList<Cereal> historialSiembras = new ArrayList<>();

    public Lote(String nombre) { this.nombre = nombre; }

    public String getNombre() { return nombre; }

    // cargar minerales presentes en el lote
    public void setMinerales(Mineral m) { minerales.add(m); }
    public Mineral getMinerales(int i) { return minerales.get(i); }
    public int cantidadMinerales() { return minerales.size(); }

    // registrar una siembra (para controlar la regla de pasturas)
    public void registrarSiembra(Cereal c) { historialSiembras.add(c); }

    // apunte: si hay algún PRIMARIO => especial, caso contrario común
    public boolean esEspecial() {
        for (Mineral m : minerales) {
            if (m.getTipo() == Mineral.Tipo.PRIMARIO) return true;
        }
        return false;
    }

    // apunte: comparo por nombre de mineral para mantenerlo simple
    private boolean contieneMineralPorNombre(String nombre) {
        for (Mineral m : minerales) {
            if (m.getNombre().equalsIgnoreCase(nombre)) return true;
        }
        return false;
    }

    // apunte: debo tener TODOS los minerales requeridos por el cereal
    public boolean contieneTodosRequeridos(Cereal cereal) {
        for (int i = 0; i < cereal.cantidadMineralesRequeridos(); i++) {
            String req = cereal.getMineralRequerido(i);
            if (!contieneMineralPorNombre(req)) return false;
        }
        return true;
    }

    // apunte: si alguna vez se sembró una PASTURA, no puedo volver a sembrar otra
    public boolean yaTuvoPastura() {
        for (Cereal c : historialSiembras) {
            if (c.getTipo() == Cereal.Tipo.PASTURA) return true;
        }
        return false;
    }

    // condición completa para poder sembrar este cereal en este lote
    public boolean puedeSembrar(Cereal cereal) {
        if (!contieneTodosRequeridos(cereal)) return false;
        if (cereal.getTipo() == Cereal.Tipo.PASTURA && yaTuvoPastura()) return false;
        return true;
    }
}