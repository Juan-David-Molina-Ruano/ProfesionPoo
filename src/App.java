public class App {
    public static void main(String[] args) throws Exception {
        Profesor profesor = new Profesor();
        profesor.setNombre("Juan");
        profesor.setSalario(profesor.calcularSueldo(10,1000));
        System.out.println(profesor.getNombre() + " gana " + profesor.getSalario() + " siendo profesor");
        
    }
}
