/*
*Ejercicio 46 | Tema 5
*Imprime un rectángulo vacío
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/

public class Ejercicio46 {
    public static void main(String[] args) {
        System.out.println();
        boolean seguir = true;
        int a=0,b=0;
        while(seguir){
            System.out.print("Introduce la altura del rectángulo(mínimo 2): ");
            a=Integer.parseInt(System.console().readLine());
            if (a>=2)
                seguir=false;
            else
                System.out.println("ERROR: Vuelve a introducir el dato.");
                System.out.println();
        }
        seguir=true;
        while(seguir){
            System.out.print("Introduce la base del rectángulo(mínimo 2): ");
            b=Integer.parseInt(System.console().readLine());
            if (b>=2)
                seguir=false;
            else
            System.out.println("ERROR: Vuelve a introducir el dato.");
            System.out.println();
        }
        int i=0,j=0,k=0;
        for(i=1;i<=a;i++){
            if(i==1||i==a){
                for(j=1;j<=b;j++){
                    System.out.print("* ");
                }
            }else{
                for(k=1;k<=b;k++){
                    if(k==1 || k==b){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                } 
            }
            System.out.println();
        }
    }
}