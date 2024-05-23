public abstract class Profesion implements IProcesos{
    private String nombre;
    private double salario;

    public Profesion(){

    }

    public Profesion(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
