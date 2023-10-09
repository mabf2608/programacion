import java.util.Scanner;

public class Ejercicio4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca el número de horas trabajadas durante la semana: ");
        int horas = sc.nextInt();

        if (horas<=40){
            int sueldo = 12*horas;
            System.out.println("El sueldo semanal que le corresponde es de "+sueldo+" €.");
        }else{
            if (horas>40 && horas<=168){
            int sueldob = 12 * 40;
            int sueldo = (16*(horas-40))+sueldob;
            System.out.println("El sueldo semanal que le corresponde es de "+sueldo+" €.");
        }else{
            System.out.println("Es imposible que se trabajen ese número de horas a la semana.");
        }
        sc.close();
        }
    }
}