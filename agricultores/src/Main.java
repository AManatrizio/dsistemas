import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // --- defino algunos minerales
        Mineral fosforoP = new Mineral("Fosforo", Mineral.Tipo.PRIMARIO);
        Mineral potasioS = new Mineral("Potasio", Mineral.Tipo.SECUNDARIO);
        Mineral nitrogenoP = new Mineral("Nitrogeno", Mineral.Tipo.PRIMARIO);

        // --- armo un lote con mezcla de minerales (=> especial por tener primarios)
        Lote lote1 = new Lote("Lote 1");
        lote1.setMinerales(fosforoP);
        lote1.setMinerales(potasioS);

        // --- defino cereales con sus requisitos
        Cereal girasol = new Cereal("Girasol", Cereal.Tipo.GRUESA);
        girasol.addMineralRequerido("Fosforo");
        girasol.addMineralRequerido("Potasio");

        Cereal trigo = new Cereal("Trigo", Cereal.Tipo.FINA);
        trigo.addMineralRequerido("Nitrogeno"); // este lote no lo tiene

        Cereal alfalfa = new Cereal("Alfalfa", Cereal.Tipo.PASTURA);
        alfalfa.addMineralRequerido("Fosforo");

        ArrayList<Cereal> catalogo = new ArrayList<>();
        catalogo.add(girasol);
        catalogo.add(trigo);
        catalogo.add(alfalfa);

        // --- cooperativa aconseja
        Cooperativa coop = new Cooperativa();
        ArrayList<Cereal> aptos = coop.aconsejar(lote1, catalogo);

        System.out.println("Lote: " + lote1.getNombre() + (lote1.esEspecial() ? " [especial]" : " [común]"));
        System.out.println("Cereales aptos (1ra vez):");
        for (Cereal c : aptos) System.out.println(" - " + c.getNombre());

        // --- simulo que sembré una pastura antes
        lote1.registrarSiembra(alfalfa);

        // ahora vuelvo a pedir consejo (ya tuvo una pastura, no debería ofrecer otra pastura)
        ArrayList<Cereal> aptos2 = coop.aconsejar(lote1, catalogo);
        System.out.println("\nCereales aptos (luego de haber sembrado una pastura antes):");
        for (Cereal c : aptos2) System.out.println(" - " + c.getNombre());
    }
}