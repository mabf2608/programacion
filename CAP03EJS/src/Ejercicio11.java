import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cantidad de Kb que quieras pasar a Mb: ");
        double Kb = sc.nextDouble();
        double Mb = Kb/1000;
        System.out.printf("%.2f Kb son un total de %.2f Mb: ",Kb,Mb);
        
        sc.close();
    }
}
