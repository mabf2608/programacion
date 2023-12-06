/*
*Ejercicio 54 | Tema 5
*Triangulo invertido vacio
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio54 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Introduzca la altura de la figura: ");
        int a=Integer.parseInt(System.console().readLine());
        int i=0, j=0;
        for (i=0;i<=a;i++){
            System.out.println();
            if (i==0 || i==a){
                for(j=1;j<=a-i;j++){
                    System.out.print("*");
                }
            }else{
                for(j=1;j<=a-i;j++){
                    if (j==1 || j==a-i){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
        }
    }
}