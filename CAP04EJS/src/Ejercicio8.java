import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce el primer número para realizar la media: ");
    float n1 = sc.nextFloat();

    System.out.println("Introduce el segundo número para realizar la media: ");
    float n2 = sc.nextFloat();

    System.out.println("Introduce el tercer número para realizar la media: ");
    float n3 = sc.nextFloat();
    
    float media = (n2+n1+n3)/3;

    System.out.printf("La nota media es %.2f",media);
    System.out.println();
    if (media >= 0 && media < 5){
        System.out.println("Tienes de nota un INSUFICIENTE");
    }else{
        if (media >= 5 && media < 6){
            System.out.println("Tienes de nota un SUFICIENTE");
        }else{
        if (media >= 6 && media < 7){
            System.out.println("Tienes de nota un BIEN");
                }else{
                    if (media >= 7 && media < 9){
                        System.out.println("Tienes de nota un NOTABLE");
                    }else{
                        if (media >= 9 && media <=10){
                        System.out.println("Tienes de nota un SOBRESALIENTE");
                        }else{
                            System.out.println("ERROR, NOTA IMPOSIBLE");
                        }
                    }
                }
            }
    sc.close();
        }
    }
}