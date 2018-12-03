package Pack05;

public class Gerente extends Persona {

    private int codigo;
    private String area_de_trabajo, cargo;

    public Gerente(String nombre, String apellido, int dni, int codigo, String area_de_trabajo, String cargo) {
        super(nombre, apellido, dni);
        this.codigo = codigo;
        this.area_de_trabajo = area_de_trabajo;
        this.cargo = cargo;
    }

    @Override
    public void mostrar() {
        System.out.println("\nAtributos Gerente: ");
        super.mostrar();
        System.out.println("Codigo: " + this.codigo + "\nArea: " + this.area_de_trabajo + "\nCargo: " + this.cargo);
    }
}
