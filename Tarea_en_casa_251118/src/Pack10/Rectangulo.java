package Pack10;

public class Rectangulo extends Poligono{

    private double lado1, lado2;

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public void areaRectangulo() {
        double area = lado1 * lado2;
        System.out.println("Area: " + area);
    }
}
