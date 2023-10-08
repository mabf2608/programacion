import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cantidad de Mb que quieras pasar a Kb: ");
        double Mb = sc.nextDouble();
        double Kb = Mb*1000;
        System.out.printf("%.2f Mb son un total de %.2f Kb: ",Mb,Kb);
        
        sc.close();
    }
}
