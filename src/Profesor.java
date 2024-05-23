public class Profesor extends Profesion{



    @Override
    public void calcularSueldo(int horasTrabajadas, double pagoPorHora){
        double sueldo = horasTrabajadas * pagoPorHora;
        System.out.println("El sueldo del profesor es: $" + sueldo);
    }

}

