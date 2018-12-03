package Pack08;

public class Principal {

    public static void main(String[] args) {
        Taxi t1 = new Taxi();
        t1.setMarca("honda");
        t1.setModelo("TR456");
        t1.setPatente("ASD123");
        t1.setColor("Azul");
        t1.setRuedas("29");
        t1.setLongitud("12");
        t1.setChasis("45");
        t1.setPotenciaCC("130");
        System.out.println("\nmarca: " + t1.getMarca() + "\nmodelo: " + t1.getModelo()
                + "\npatente: " + t1.getPatente() + "\ncolor: " + t1.getColor() + "\nruedas: "
                + t1.getRuedas() + "\nlongitud: " + t1.getLongitud() + "\nchasis: " + t1.getChasis()
                + "\npotenciaCC: " + t1.getPotenciaCC());

        Autobus a1 = new Autobus();
        a1.setMarca("subaru");
        a1.setModelo("QR326");
        a1.setPatente("QWE765");
        a1.setColor("NEGRO");
        a1.setRuedas("27");
        a1.setLongitud("29");
        a1.setChasis("50");
        a1.setPotenciaCC("221");
        System.out.println("\nmarca: " + a1.getMarca() + "\nmodelo: " + a1.getModelo()
                + "\npatente: " + a1.getPatente() + "\ncolor: " + a1.getColor() + "\nruedas: "
                + a1.getRuedas() + "\nlongitud: " + a1.getLongitud() + "\nchasis: " + a1.getChasis()
                + "\npotenciaCC: " + a1.getPotenciaCC());
    }

}
