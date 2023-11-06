/*
*Ejercicio 42 | Tema 5
*Primos 5 consecutivos
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio42 {
    public static boolean esPrimo(int v1){
        boolean primo = true;
        for(int i=2; i<=v1/2;i++){
            if(v1%i==0)
                return primo=false;
        }
        return primo;
    }
    public static void main(String[] args) {
        System.out.println();
        boolean seguir=true;
        int n = 0;
        do{
        System.out.println("Introduzca un número entero positivo");
        n = Integer.parseInt(System.console().readLine());
        if (n>0)
            seguir=false;
        }while(seguir);
        int i =1;
        for(i=0;n+i<=n+4;i++){
            if (esPrimo(n+i)){
                System.out.printf("%d es primo%n",n+i);
            }else{
                System.out.printf("%d no es primo%n",n+i);
            }
        }
    }
}
