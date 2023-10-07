import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce cuantas horas ha trabajado el trabajador: ");
        int horas=sc.nextInt();
        int total=horas*12;

        System.out.println("El trabajador ha recibido un salario de "+total+" € con respecto a sus "+horas+" horas trabajadas.");

        sc.close();
    }
}
