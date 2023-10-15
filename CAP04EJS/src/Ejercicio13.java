import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println();
    System.out.println("Introduce tres números enteros para ordenarlos: ");
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int n3 = sc.nextInt();
    System.out.println();

    if (n1<n2 && n1<n3){
        if (n2<n3){
            System.out.printf("%d %d %d",n1,n2,n3);
        }else{
            System.out.printf("%d %d %d",n1,n3,n2);
        }
    }

    if (n2<n1 && n2<n3){
        if (n1<n3){
            System.out.printf("%d %d %d",n2,n1,n3);
        }else{
            System.out.printf("%d %d %d",n2,n3,n1);
        }
    }

    if (n3<n2 && n3<n1){
        if (n2<n1){
            System.out.printf("%d %d %d",n3,n2,n1);
        }else{
            System.out.printf("%d %d %d",n3,n1,n2);
        }
    }
    if (n1==n2 && n1==n3){
            System.out.printf("%d %d %d",n1,n2,n3);
    }

    if (n1==n2 && n1<n3){
            System.out.printf("%d %d %d",n1,n2,n3);
    }

    if (n1<n2 && n1==n3){
            System.out.printf("%d %d %d",n1,n3,n2);
    }

    if (n1<n2 && n2==n3){
            System.out.printf("%d %d %d",n2,n3,n1);
    }
    sc.close();
    }
}
