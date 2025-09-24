import java.util.ArrayList;

public class Pais {
    private String nombre;
    // un país tiene varias provincias → lista
    private ArrayList<Provincia> provincias = new ArrayList<>();

    public Pais() { }
    public Pais(String nombre) { this.nombre = nombre; }

    // getters y setters básicos
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    // agregar una provincia
    public void setProvincias(Provincia p) { provincias.add(p); }
    // obtener una provincia por índice
    public Provincia getProvincias(int i) { return provincias.get(i); }
    // cantidad de provincias
    public int cantidadProvincias() { return provincias.size(); }

    // lista con todas las ciudades del país que están en déficit
    public ArrayList<Ciudad> ciudadesQueGastanMasDeLoQueRecaudan() {
        ArrayList<Ciudad> res = new ArrayList<>();
        for (Provincia prov : provincias) {
            res.addAll(prov.ciudadesEnDeficit());
        }
        return res;
    }

    // lista con las provincias que tienen > 1/2 ciudades en déficit
    public ArrayList<Provincia> provinciasConMasDeLaMitadEnDeficit() {
        ArrayList<Provincia> res = new ArrayList<>();
        for (Provincia prov : provincias) {
            if (prov.masDeLaMitadEnDeficit()) res.add(prov);
        }
        return res;
    }
}