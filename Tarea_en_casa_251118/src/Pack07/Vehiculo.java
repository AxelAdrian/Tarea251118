package Pack07;

public class Vehiculo {

    private String marca, modelo, patente, color, ruedas, longitud, chasis, potenciaCC;

    public Vehiculo(String marca, String modelo, String patente, String color, String ruedas, String longitud, String chasis, String potenciaCC) {
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.color = color;
        this.ruedas = ruedas;
        this.longitud = longitud;
        this.chasis = chasis;
        this.potenciaCC = potenciaCC;
    }

    public void mostrar() {
        System.out.println("\nAtributos:\nMarca: " + this.marca + "\nModelo: " + this.modelo
                + "\nPatente: " + this.patente + "\nColor: " + this.color + "\nRuedas: " + this.ruedas
                + "\nLongiud: " + this.longitud + "\nChasis: " + this.chasis + "\nPotenciaCC: " + this.potenciaCC);

    }
}
