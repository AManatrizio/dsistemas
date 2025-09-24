import java.util.ArrayList;

// apunte: funciones de ayuda para pedir info típica del enunciado
public class ConsultasRestaurantes {

    // personas a las que les gusta un plato en un restaurante específico
    public static ArrayList<Persona> personasQueGustanDe(Plato plato, Restaurante restaurante, ArrayList<Persona> personas) {
        ArrayList<Persona> res = new ArrayList<>();
        for (Persona per : personas) {
            for (Preferencia pref : per.getGustos()) {
                if (pref.getPlato() == plato && pref.getRestaurante() == restaurante) {
                    res.add(per);
                    break;
                }
            }
        }
        return res; // puede volver vacío (plato-restaurante que no gusta a nadie)
    }

    // todos los platos que una persona dice gustarle en un restaurante dado
    public static ArrayList<Plato> platosQueLeGustanEn(Persona persona, Restaurante restaurante) {
        ArrayList<Plato> res = new ArrayList<>();
        for (Preferencia pref : persona.getGustos()) {
            if (pref.getRestaurante() == restaurante) res.add(pref.getPlato());
        }
        return res;
    }
}