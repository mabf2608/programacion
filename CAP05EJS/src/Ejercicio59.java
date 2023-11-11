/*
*Ejercicio 59 | Tema 5
*Árbol de Navidad
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio59 {
    public static void main(String[] args) {
        System.out.println();
        boolean seguir=true;
        int n=0;
        while (seguir) {
            System.out.print("Introduce la altura del árbol(minimo4): ");
            n=Integer.parseInt(System.console().readLine());
            if (n>=4){
                seguir=false;
            }else{
                System.out.println();
                System.out.println("ERROR: Introduce una altura permitida.");
            }
        }
        int i=0,j=0,k=0;
        for (i=1;i<=n;i++){
            System.out.println();
            if(i==1||i==n){
                for(j=1;j<=n-3;j++){
                System.out.print(" ");
                }
                if(i==1){
                    System.out.print("*");
                }else{
                    System.out.print("Y");
                }
            }else{
                for(j=1;j<=n-i-1;j++){
                    System.out.print(" ");
                }
                for(j=1;j<=2*i-3;j++){
                    if (i==n-1){
                        for(k=1;k<=n-i;k++){
                            System.out.print("^");
                        }
                    }else{
                        if (j==1||j==2*i-3)
                            System.out.print("^");
                        else
                            System.out.print(" ");
                    }
                }
            }
        }
    }
}