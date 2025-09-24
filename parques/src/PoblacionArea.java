// apunte: unión (Área, Especie) con el número de individuos
public class PoblacionArea {
    private Area area;
    private Especie especie;
    private int individuos;

    public PoblacionArea(Area area, Especie especie, int individuos) {
        this.area = area; this.especie = especie; this.individuos = individuos;
    }
}