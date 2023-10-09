import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println();
        System.out.print("Introduce el día de la semana sin tildes para saber que asignatura tienes a primera hora: ");
        Scanner sc = new Scanner(System.in);
        String dia = sc.nextLine();

        if (dia.toUpperCase().equals("LUNES") || dia.toUpperCase().equals("JUEVES")){
            System.out.println("Tienes programación.");
        }else{
            if (dia.toUpperCase().equals("MARTES") || dia.toUpperCase().equals("MIERCOLES")){
                System.out.println("Tienes Lenguaje de Marcas.");
            }else{
                if (dia.toUpperCase().equals("VIERNES")){
                    System.out.println("Tienes Formación y Orientación Laboral.");
                }else{
                    if (dia.toUpperCase().equals("SABADO") || dia.toUpperCase().equals("DOMINGO")){
                        System.out.println("Ese día no hay clase.");
                    }else{
                        System.out.println("Día introducido incorrecto, recuerda que no deben llevar tildes.");
                    }
                }
            }
        }

        sc.close();
    }
}
