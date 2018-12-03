package Pack10;

public class Principal {

    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo();
        r1.setLado1(2);
        r1.setLado2(4);
        r1.areaRectangulo();

        Triangulo t1 = new Triangulo();
        t1.setLado1(4);
        t1.setLado2(5);
        t1.setLado3(7);
        t1.areaTriangulo();

    }

}
