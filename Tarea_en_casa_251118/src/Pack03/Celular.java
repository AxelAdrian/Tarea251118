package Pack03;

public class Celular {

    private String color, marca;
    private double dimensiones, precio;

    public Celular(String color, String marca, double dimensiones, double precio) {
        this.color = color;
        this.marca = marca;
        this.dimensiones = dimensiones;
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

    public void mostrar() {
        System.out.println("Atributos:");
        System.out.println("color: " + this.color + "\nmarca: " + this.marca + "\ndimensiones: " + this.dimensiones + "\nprecio: " + this.precio);
    }

}
