// apunte clave del enunciado: "me gusta X plato EN Y restaurante"
// lo modelamos como una tupla (persona, restaurante, plato)
public class Preferencia {
    private Persona persona;
    private Restaurante restaurante;
    private Plato plato;

    public Preferencia(Persona persona, Restaurante restaurante, Plato plato) {
        this.persona = persona;
        this.restaurante = restaurante;
        this.plato = plato;
    }

    public Persona getPersona() { return persona; }
    public Restaurante getRestaurante() { return restaurante; }
    public Plato getPlato() { return plato; }

    @Override public String toString() {
        return persona.getNombre() + " → le gusta " + plato.getNombre() + " en " + restaurante.getNombre();
    }
}