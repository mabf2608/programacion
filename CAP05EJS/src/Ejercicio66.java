/*
*Ejercicio 66 | Tema 5
*Señal trafico
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio66 {
    public static void main(String[] args) {
        boolean seguir=true;
        int alt=0;
        int dis=4;
        while (seguir) {
            System.out.println();
            System.out.print("Introduce la altura de la señal(impar mayor o igual que 3): ");
            alt=Integer.parseInt(System.console().readLine());
            if (alt>=3&&alt%2!=0){
                seguir=false;
            }else{
                System.out.println();
                System.out.print("ERROR: Introduce un numero impar mayor o igual a 3.");
            }
        }
        int j=0;
        for(int i=1;i<=alt;i++){
            System.out.println();
            if(i<=alt/2){
                for(j=1;j<=i-1;j++){
                    System.out.print(" ");
                }
            }else{
                for(j=1;j<=alt-i;j++){
                    System.out.print(" ");
                }
            }
            System.out.print("*");
            for(j=1;j<=dis;j++){
                System.out.print(" ");
            }
            System.out.print("*");
        }
        System.out.println();
    }
}