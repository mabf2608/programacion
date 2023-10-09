import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce un numero del 1 al 7 para saber que día de la semana es: ");
        int dia = sc.nextInt();

        switch(dia){
            case 1:
            System.out.println("Lunes");
            break;

            case 2:
            System.out.println("Martes");
            break;

            case 3:
            System.out.println("Miércoles");
            break;

            case 4:
            System.out.println("Jueves");
            break;

            case 5:
            System.out.println("Viernes");
            break;

            case 6:
            System.out.println("Sábado");
            break;

            case 7:
            System.out.println("Domingo");
            break;

            default:
            System.out.println("No existe ese día de la semana.");
        }

        sc.close();
    }
}