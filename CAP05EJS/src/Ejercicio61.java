/*
*Ejercicio 61 | Tema 5
*V
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio61 {
    public static void main(String[] args) {
        System.out.println();
        boolean seguir=true;
        int n=0;
        while (seguir) {
            System.out.print("Introduce la altura de la v(mayor o igual que 3): ");
            n=Integer.parseInt(System.console().readLine());
            if(n<3){
                System.out.println();
                System.out.println("ERROR: El número debe ser mayor o igual que 3.");
            }else{
                seguir=false;
            }
        }
        int i=0,j=0;
        for(i=0;i<=n-1;i++){
            System.out.println();
            for(j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=3;j++){
                System.out.print("*");
            }
            for(j=1;j<=((n-i-1)*2);j++){
                System.out.print(" ");
            }
            for(j=1;j<=3;j++){
                System.out.print("*");
            }
        }
    }
}
