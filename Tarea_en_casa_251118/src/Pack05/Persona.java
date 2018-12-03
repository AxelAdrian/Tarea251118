package Pack05;

public class Persona {

    private String nombre;
    private String apellido;
    private int dni;

    public Persona(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public void mostrar() {
        System.out.println("Nombre: " + this.nombre + "\nApellido: " + this.apellido + "\nDni: " + this.dni);
    }
}
