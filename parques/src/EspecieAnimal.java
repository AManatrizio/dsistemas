import java.util.ArrayList;

public class EspecieAnimal extends Especie {
    private String periodoCelo;
    private Dieta dieta;
    // apunte: qué especies come (pueden ser vegetales o animales)
    private ArrayList<Especie> seAlimentaDe = new ArrayList<>();

    public EspecieAnimal(String cient, String vulgar, String celo, Dieta dieta) {
        super(cient, vulgar);
        this.periodoCelo = celo; this.dieta = dieta;
    }

    public void agregarAlimento(Especie e) { seAlimentaDe.add(e); }
}