/*
*Ejercicio 38 | Tema 5
*Reloj de arena relleno
*@author Miguel Ángel Bonilla Fernández 1ºDAW
*/
public class Ejercicio38 {
    public static void main(String[] args) {
    boolean seguir = true;
    int a=0;
    while(seguir){
        System.out.println();
        System.out.print("Introduce la altura del reloj de arena: ");
        a = Integer.parseInt(System.console().readLine());
        if(a%2==0 || a<=3){
            System.out.println();
            System.out.println("ERROR, Vuelva a introducir la altura.");
        }else{
            seguir=false;
        }
    }
        int i=0,j=0,k=0;
        char ast='*',esp=' ';
        for(i=a;i>=1;i=i-2){
            System.out.println();
            for(j=i;j<=a;j=j+2){
                System.out.print(esp);
            }
            for(k=1;k<=i;k++){
                System.out.print(ast);
            }
        }
        for(i=3;i<=a;i=i+2){
            System.out.println();
            for(j=a;j>=i;j=j-2){
                System.out.print(esp);
            }
            for(k=1;k<=i;k++){
                System.out.print(ast);
            }
        }
    }
}