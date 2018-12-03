package Pack02;

public class Auto {

    private String color, motor;
    private double ruedas, velocidad;

    public void acelerar() {
        System.out.println("auto acelerando ...");
    }

    public void arrancando() {
        System.out.println("auto arracando...");
    }

    public void frenando() {
        System.out.println("auto frenando....");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public double getRuedas() {
        return ruedas;
    }

    public void setRuedas(double ruedas) {
        this.ruedas = ruedas;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

}
