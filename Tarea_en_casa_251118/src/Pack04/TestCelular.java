package Pack04;

public class TestCelular {

    public static void main(String[] args) {
        Celular c1 = new Celular();
        c1.setColor("negro");
        c1.setDimensiones(5);
        c1.setMarca("samsung");
        c1.setPrecio(6000);

        System.out.println("Atributos:");
        System.out.println("color: " + c1.getColor() + "\ndimensiones: " + c1.getDimensiones() + "\nmarca: " + c1.getMarca() + "\nprecio: " + c1.getPrecio());
    }

}
