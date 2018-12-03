package Pack06;

public class Empleado extends Persona {

    private int codigo;
    private String area_de_trabajo, cargo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getArea_de_trabajo() {
        return area_de_trabajo;
    }

    public void setArea_de_trabajo(String area_de_trabajo) {
        this.area_de_trabajo = area_de_trabajo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
