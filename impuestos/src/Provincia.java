import java.util.ArrayList;

public class Provincia {
    private String nombre;
    // una provincia tiene varias ciudades → lista
    private ArrayList<Ciudad> ciudades = new ArrayList<>();

    public Provincia() { }
    public Provincia(String nombre) { this.nombre = nombre; }

    // getters y setters básicos
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    // agregar una ciudad a la lista
    public void setCiudades(Ciudad c) { ciudades.add(c); }
    // obtener una ciudad por índice
    public Ciudad getCiudades(int i) { return ciudades.get(i); }
    // saber cuántas ciudades tiene la provincia
    public int cantidadCiudades() { return ciudades.size(); }

    // devuelve solo las ciudades que están en déficit
    public ArrayList<Ciudad> ciudadesEnDeficit() {
        ArrayList<Ciudad> res = new ArrayList<>();
        for (Ciudad c : ciudades) {
            if (c.estaEnDeficit()) res.add(c);
        }
        return res;
    }

    // true si más de la mitad de las ciudades controladas de la provincia están en déficit
    public boolean masDeLaMitadEnDeficit() {
        int totalControladas = 0;
        int enDeficit = 0;
        for (Ciudad c : ciudades) {
            if (c.entraAlControl()) { // solo cuento las que superan los 100k
                totalControladas++;
                if (c.estaEnDeficit()) enDeficit++;
            }
        }
        return totalControladas > 0 && enDeficit > totalControladas / 2.0;
    }
}