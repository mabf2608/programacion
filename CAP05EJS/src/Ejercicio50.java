/*
*Ejercicio 50 | Tema 5
*Dibujar 155
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio50 {
    public static void main(String[] args) {
        System.out.println();
        boolean seguir=true;
        int a=0, e=0;
        while(seguir){
            System.out.print("Introduce la altura(5 como mínimo): ");
            a=Integer.parseInt(System.console().readLine());
            if(a<5){
                System.out.println();
                System.out.println("ERROR: Introduzca la altura correcta.");
            }else{
                seguir=false;
            }
        }
        seguir=true;
        while(seguir){
            System.out.print("Introduce el espacio entre números(1 como mínimo): ");
            e=Integer.parseInt(System.console().readLine());
            if(e<1){
                System.out.println();
                System.out.println("ERROR: Introduzca un espacio permitido.");
            }else{
                seguir=false;
            }
        }
        System.out.println();
        int anch=4*2+e*2+1, i=0, j=0, k=0;
        
        for(i=1;i<=a;i++){
            for (j=1;j<=anch;j++){
                if(j==1){
                    System.out.print("*");
                }
                if(j==anch-e){
                    for(k=1;k<=e;k++){
                        System.out.print(" ");
                    }
                    for(k=1;k<=4;k++){
                        if (i==1||i==3||i==a){
                            System.out.print("*");
                        }
                        if (i==2 && k==1)
                            System.out.print("*   ");
                        if (i>3 && i<a && k==4)
                            System.out.print("   *");
                    }
                }
                if(j==anch-(e+4)){
                    for(k=1;k<=e;k++){
                        System.out.print(" ");
                    }
                    for(k=1;k<=4;k++){
                        if (i==1||i==3||i==a){
                            System.out.print("*");
                        }
                        if (i==2 && k==1)
                            System.out.print("*   ");
                        if (i>3 && i<a && k==4)
                            System.out.print("   *");
                    }
                }
            }
        System.out.println();
        }
    }
}