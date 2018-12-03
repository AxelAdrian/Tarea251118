package Pack09;

public class Triangulo extends Poligono {

    private double lado1, lado2, lado3;

    public Triangulo(double lado1, double lado2, double lado3, double numLados) {
        super(numLados);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public void areaTriangulo() {
        double p = lado1 + lado2 + lado3;
        double s = p / 2;
        double area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
        System.out.println("Area: " + area);

    }
}
