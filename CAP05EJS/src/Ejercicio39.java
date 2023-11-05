/*
*Ejercicio 39 | Tema 5
*Factoriales
*@author Miguel Ángel Bonilla Fernández 1ºDAW
*/
public class Ejercicio39 {
    public static void main(String[] args) {
        int n=0;
        System.out.println();
        do{
        System.out.print("Por favor introduzca un número entero positivo: ");
        n = Integer.parseInt(System.console().readLine());
        }while(n<=0);
        System.out.println();
        int i=0,j=0;
        for (i=1;i<=n;i++){
            int k=1;
            for (j=1;j<=i;j++){
                k=k*j;
            }
            System.out.printf("%d! = %d%n",i,k);
        }
    }
}
