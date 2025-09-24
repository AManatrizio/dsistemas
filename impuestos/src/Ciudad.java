public class Ciudad {
    // atributos básicos
    private String nombre;
    private long poblacion;

    // recaudación por los 5 impuestos
    private double imp1, imp2, imp3, imp4, imp5;

    // gasto en mantenimiento
    private double gastoMantenimiento;

    // constructores: vacío y con datos iniciales
    public Ciudad() { }

    public Ciudad(String nombre, long poblacion) {
        this.nombre = nombre;
        this.poblacion = poblacion;
    }

    // getters y setters → sirven para leer o modificar los valores privados
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getNombre() { return nombre; }

    public void setPoblacion(long poblacion) { this.poblacion = poblacion; }
    public long getPoblacion() { return poblacion; }

    public void setImp1(double v) { this.imp1 = v; }
    public void setImp2(double v) { this.imp2 = v; }
    public void setImp3(double v) { this.imp3 = v; }
    public void setImp4(double v) { this.imp4 = v; }
    public void setImp5(double v) { this.imp5 = v; }

    public void setGastoMantenimiento(double g) { this.gastoMantenimiento = g; }

    // método para saber si entra en el control del país (si tiene +100.000 hab)
    public boolean entraAlControl() {
        return poblacion >= 100_000;
    }

    // suma de los 5 impuestos = total recaudado
    public double recaudadoTotal() {
        return imp1 + imp2 + imp3 + imp4 + imp5;
    }

    // chequea si está en déficit: gasta más de lo que recauda
    public boolean estaEnDeficit() {
        if (!entraAlControl()) return false; // solo controlamos las grandes
        return gastoMantenimiento > recaudadoTotal();
    }
}