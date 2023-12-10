/*
*Ejercicio 11 | Tema 7
*Arrays Auxiliares.
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio11 {
    public static boolean esprimo(int n){
        boolean primo=true;
        for(int i=2;i<=n/2;i++){
            if (n%i==0){
                primo=false;
                i=n/2;
            }
        }
        return primo;
    }
    public static void tabla(int[] numero){
        int i;
        for(i=0;i<10;i++){
            if (i==0){
                System.out.printf("----------------------------------------------------------------------%n");
                System.out.printf("| Índice |  %d  |",i);
            }else{
                System.out.printf("  %d  |",i);
            }
        }
        System.out.println();
        for(i=0;i<10;i++){
            if (i==0){
                System.out.printf("----------------------------------------------------------------------%n");
                System.out.printf("| Valor  |  %d |",numero[i]);
            }else{
                System.out.printf("  %d |",numero[i]);
            }
        }
        System.out.println();
        System.out.println("----------------------------------------------------------------------");
    }
    public static void main(String[] args) {
        System.out.println();
        int[] numero=new int[10];
        int[] primo=new int[10];
        int[] noprimo=new int[10];
        int primos=0,noprimos=0;
        int j;
        int i;
        for(i=0;i<10;i++){
            System.out.printf("Introduce el numero: %d: ",i+1);
            numero[i]=Integer.parseInt(System.console().readLine());
            if (esprimo(numero[i])&&numero[i]!=1){
                primo[primos]=numero[i];
                primos++;
            }else{
                noprimo[noprimos]=numero[i];
                noprimos++;
            }
        }
        System.out.println();
        System.out.println("Array Inicial");
        tabla(numero);
        System.out.println();
        System.out.println("Array Final");
        for (i=0;i<10;i++){
            if (i<primos){;
                numero[i]=primo[i];
            }else{
                numero[i]=noprimo[i-primos];
            }
        }
        tabla(numero);
    }
}