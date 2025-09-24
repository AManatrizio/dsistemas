public class Main {
    public static void main(String[] args) {
        Figura c = new Circulo();
        Figura q = new Cuadrado();
        Figura t = new Triangulo();

        System.out.println("Área círculo: " + c.area());
        System.out.println("Área cuadrado: " + q.area());
        System.out.println("Área triángulo: " + t.area());
    }
}