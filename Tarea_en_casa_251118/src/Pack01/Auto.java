package Pack01;

public class Auto {

    private String color, motor;
    private double ruedas, velocidad;

    public Auto(String color, String motor, double ruedas, double velocidad) {
        this.color = color;
        this.motor = motor;
        this.ruedas = ruedas;
        this.velocidad = velocidad;
    }

    public void mostrar() {
        System.out.println("Atributos: \ncolor: " + this.color + "\nmotor: " + this.motor + "\nruedas: " + this.ruedas + "\nvelocidad: " + this.velocidad);
    }

    public void acelerar() {
        System.out.println("auto acelerando ...");
    }

    public void arrancando() {
        System.out.println("auto arracando...");
    }

    public void frenando() {
        System.out.println("auto frenando....");
    }
}
