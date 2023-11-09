/*
*Ejercicio 47 | Tema 5
*8 M
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/

public class Ejercicio47 {
    public static void main(String[] args) {
    boolean seguir=true;
    int a=0;
        while(seguir){
            System.out.print("Introduce la altura: ");
            a=Integer.parseInt(System.console().readLine());
            if (a%2!=0 && a>=5)
                seguir=false;
            else{
                System.out.println();
                System.out.print("ERROR: El número debe ser un impar mayor que 5.");
            }
        }
    int b=6,i=0,j=0,k=0;
    System.out.println();
        for (i=1;i<=a;i++){
            if(i==1||i==a/2+1||i==a){
                for(j=1;j<=b;j++){
                    System.out.print("M");
                }
            }else{
                for(k=1;k<=b;k++){
                    if(k==1||k==b)
                        System.out.print("M");
                    else
                        System.out.print(" ");
                }
            }
        System.out.println();
        }
    }
}
