package Pack09;

public class Rectangulo extends Poligono {

    private double lado1, lado2;

    public Rectangulo(double lado1, double lado2, double numLados) {
        super(numLados);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public void areaRectangulo() {
        double area = lado1 * lado2;
        System.out.println("Area: " + area);
    }

}
