import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println();
        System.out.print("Introduce el día de la semana sin tildes para saber que asignatura tienes a primera hora: ");
        Scanner sc = new Scanner(System.in);
        String dia = sc.nextLine();

        if (dia.equals("Lunes") || dia.equals("Jueves")){
            System.out.println("Tienes programación.");
        }else{
            if (dia.equals("Martes") || dia.equals("Miercoles")){
                System.out.println("Tienes Lenguaje de Marcas.");
            }else{
                if (dia.equals("Viernes")){
                    System.out.println("Tienes Formación y Orientación Laboral.");
                }else{
                    if (dia.equals("Sabado") || dia.equals("Domingo")){
                        System.out.println("Esos días no hay clase.");
                    }else{
                        System.out.println("Día introducido incorrecto, recuerda que no deben llevar tildes.");
                    }
                }
            }
        }

        sc.close();
    }
}
