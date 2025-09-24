public abstract class Especie {
    // apunte: base común para vegetal/animal
    protected String nombreCientifico;
    protected String nombreVulgar;

    public Especie(String cientifico, String vulgar) {
        this.nombreCientifico = cientifico; this.nombreVulgar = vulgar;
    }
    public String getNombreVulgar() { return nombreVulgar; }
}