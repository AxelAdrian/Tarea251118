package Pack07;

public class Principal {

    public static void main(String[] args) {
        Taxi t1 = new Taxi("honda", "AZ123", "ABC123", "amarillo", "29", "19", "45", "120");
        t1.mostrar();
        Autobus a1 = new Autobus("subaru", "QW567", "QWE321", "Verde", "45", "30", "55", "222");
        a1.mostrar();
    }

}
