package Pack06;

public class Principal {

    public static void main(String[] args) {
        Empleado e1 = new Empleado();

        e1.setNombre("Vicky");
        e1.setApellido("Mariba");
        e1.setDni(3214567);
        e1.setCodigo(3344);
        e1.setArea_de_trabajo("Administracion");
        e1.setCargo("Administrativa");

        System.out.println("Empleado: ");
        System.out.println("Nombre: " + e1.getNombre());
        System.out.println("Apellido: " + e1.getApellido());
        System.out.println("Dni: " + e1.getDni());
        System.out.println("Legajo: " + e1.getCodigo());
        System.out.println("Area: " + e1.getArea_de_trabajo());
        System.out.println("Cargo: " + e1.getCargo());

        Gerente g1 = new Gerente();
        g1.setNombre("Axel");
        g1.setApellido("Adrian");
        g1.setDni(334455667);
        g1.setCodigo(2211);
        g1.setArea_de_trabajo("Informatica");
        g1.setCargo("Programador");

        System.out.println("");
        System.out.println("Gerente:");
        System.out.println("Nombre: " + g1.getNombre());
        System.out.println("Apellido: " + g1.getApellido());
        System.out.println("Dni: " + g1.getDni());
        System.out.println("Legajo: " + g1.getCodigo());
        System.out.println("Area: " + g1.getArea_de_trabajo());
        System.out.println("Cargo: " + g1.getCargo());

    }

}
