// apunte: quién (investigador) investigó qué especie en qué proyecto
public class ParticipacionInvestigacion {
    private Investigador investigador;
    private Proyecto proyecto;
    private Especie especie;

    public ParticipacionInvestigacion(Investigador inv, Proyecto proj, Especie esp) {
        this.investigador = inv; this.proyecto = proj; this.especie = esp;
        if (proj != null) proj.agregarParticipacion(this);
    }
}