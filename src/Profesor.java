public class Profesor extends Profesion{



    @Override
    public double calcularSueldo(int horasTrabajadas, double pagoPorHora){
        double sueldo = horasTrabajadas * pagoPorHora;
        return sueldo;
    }

}

