/*
*Ejercicio 65 | Tema 5
*Letra A
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio65 {
    public static void main(String[] args) {
        boolean seguir=true;
        int alt=0, pal=0;
        System.out.println();
        while (seguir) {
            System.out.print("Introduzca la altura de la A(mayor o igual a 3): ");
            alt=Integer.parseInt(System.console().readLine());
            if (alt>=3){
                seguir=false;
            }else{
                System.out.println("ERROR: Introduzca un valor correcto.");
                System.out.println();
            }
        }
        seguir=true;
        while (seguir) {
        System.out.printf("Introduzca la fila del palito horizontal(entre 2 y %d): ",alt-1);
        pal=Integer.parseInt(System.console().readLine());
            if (pal>=2&&pal<=alt-1){
                seguir=false;
            }else{
                System.out.println("ERROR: Introduzca un valor correcto.");
                System.out.println();
            }
        }
        int j=0;
        System.out.println();
        for(int i=1;i<=alt;i++){
            for(j=1;j<=alt-i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=2*i-1;j++){
                if (j==1||j==2*i-1){
                    System.out.print("*");
                }else{
                    if(i==pal){
                        for(j=1;j<=2*i-2;j++){
                            System.out.print("*");
                        }
                    }else{
                    System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}