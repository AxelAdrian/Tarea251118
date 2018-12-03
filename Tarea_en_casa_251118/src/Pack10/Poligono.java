package Pack10;

public class Poligono {

    private double numLados;

    public double getNumLados() {
        return numLados;
    }

    public void setNumLados(double numLados) {
        this.numLados = numLados;
    }

    public double areaPoligono(double b, double a) {
        double area = b * a;
        return area;
    }
}
