import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println();
        System.out.println("Introduce la altura desde la que caería el objeto: ");
        double h = sc.nextDouble();
        double g = 9.81;// m/s^2
        double t = Math.sqrt((2*h)/g);
        if (h <= 0){
            System.out.println("El objeto no puede caer si la altura es 0 o menos.");
        }else{
            System.out.printf("El tiempo que tarda en caer es: %.2f segundos",t);
        }
        sc.close();
    }
}
