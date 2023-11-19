/*
*Ejercicio 69 | Tema 5
*Piramide Maya
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio69 {
    public static void paredesterraza(int v1){
        for(int j=1;j<=(v1-4)/2;j++){
            System.out.print("*");
        }
    }
    public static void main(String[] args) {
        System.out.println();
        System.out.print("Introduzca la altura de la pirámide maya: ");
        int alt=Integer.parseInt(System.console().readLine());
        int j=0,anch=6,terraza=4;
        System.out.println();
        for (int i=1;i<=alt;i++){
            for(j=1;j<=alt-i;j++){
                System.out.print(" ");
            }
            if(i%2==0){
                paredesterraza(anch);
                for(j=1;j<=terraza;j++){
                    System.out.print(" ");
                }
                paredesterraza(anch);
            }else{
                for(j=1;j<=anch;j++){
                    System.out.print("*");
                }
            }
            anch+=2;
            System.out.println();
        }
    }
}