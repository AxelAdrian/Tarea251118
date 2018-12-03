package Pack05;

public class Principal {

    public static void main(String[] args) {
        Empleado e1 = new Empleado("Vicky", "Mariba", 1234567, 2233, "Administracion", "Administrativa");
        e1.mostrar();
        Gerente g1 = new Gerente("Axel", "Adrian", 12345678, 1122, "Sistemas", "programador");
        g1.mostrar();
    }

}
