import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
    System.out.println();
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la nota del primer examen: ");
    double nota1=sc.nextDouble();

    System.out.print("Introduce la media deseada: ");
    double notad=sc.nextDouble();

    double nota2= (notad - (nota1*0.40))/0.6;
    System.out.print("La nota que debes sacar en el proximo examen es: "+nota2);
    System.out.println();
    sc.close();
    }
}
