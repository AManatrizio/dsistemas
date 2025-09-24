import java.util.ArrayList;

// Apunte: clase "servicio" para aconsejar qué cereales van en un lote
//   - filtra por requisitos de minerales
//   - aplica la regla extra de pasturas
public class Cooperativa {

    // dado un lote y una lista de cereales, devuelvo los que se pueden sembrar
    public ArrayList<Cereal> aconsejar(Lote lote, ArrayList<Cereal> opciones) {
        ArrayList<Cereal> res = new ArrayList<>();
        for (Cereal c : opciones) {
            if (lote.puedeSembrar(c)) res.add(c);
        }
        return res;
    }
}