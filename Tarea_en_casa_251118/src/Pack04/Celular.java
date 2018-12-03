package Pack04;

public class Celular {

    private String color, marca;
    private double dimensiones, precio;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(double dimensiones) {
        this.dimensiones = dimensiones;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void encender() {
        System.out.println("telefono encendido!");
    }

    public void apagar() {
        System.out.println("telefono apagado!");
    }

    public void conexion() {
        System.out.println("telefono conectado");
    }

}
