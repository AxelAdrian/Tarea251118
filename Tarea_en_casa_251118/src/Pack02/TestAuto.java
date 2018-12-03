package Pack02;

public class TestAuto {

    public static void main(String[] args) {
        Auto a1 = new Auto();
        a1.setColor("Rojo");
        a1.setMotor("V8");
        a1.setRuedas(26);
        a1.setVelocidad(220);

        System.out.println("Atributos:");
        System.out.println("Color: " + a1.getColor() + "\nmotor: " + a1.getMotor() + "\nruedas: " + a1.getRuedas() + "\nvelocidad: " + a1.getVelocidad());

    }

}
