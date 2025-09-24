public class Ciudad {
    private String nombre;
    private long poblacion;

    public Ciudad() { }

    public Ciudad(String nombre, long poblacion) {
        this.nombre = nombre;
        this.poblacion = poblacion;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public long getPoblacion() { return poblacion; }
    public void setPoblacion(long poblacion) { this.poblacion = poblacion; }
}