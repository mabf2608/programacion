/*
*Ejercicio 19 | Tema 7
*Numero en posición concreta de un array
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio19 {
    public static void tabla(int[] numero){
        int i;
        for(i=0;i<12;i++){
            if (i==0){
                System.out.printf("----------------------------------------------------------------------------------------------%n");
                System.out.printf("| Índice |%3d   |",i);
            }else{
                System.out.printf("%3d   |",i);
            }
        }
        System.out.println();
        for(i=0;i<12;i++){
            if (i==0){
                System.out.printf("----------------------------------------------------------------------------------------------%n");
                System.out.printf("| Valor  |%3d   |",numero[i]);
            }else{
                System.out.printf("%3d   |",numero[i]);
            }
        }
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------");
    }
    public static void main(String[] args) {
        int[] numero=new int[12];
        int i;
        for(i=0;i<12;i++){
            numero[i]=(int)(Math.random()*201);
        }
        System.out.println();
        System.out.println("ARRAY INICIAL");
        tabla(numero);
        System.out.println();
        System.out.print("Introduzca el número que quiera insertar: ");
        int num_insertar=Integer.parseInt(System.console().readLine());
        int num_posicion=0;
        boolean seguir=true;
        System.out.println();
        while (seguir) {
            System.out.print("Introduzca la posición (0-11): ");
            num_posicion=Integer.parseInt(System.console().readLine());
            if (num_posicion>=0&&num_posicion<=11){
                seguir=false;
            }else{
                System.out.println("ERROR: Introduzca una posición válida.");
            }
            System.out.println();
        }
        for(i=11;i>=num_posicion;i--){
            if(i==num_posicion){
                numero[i]=num_insertar;
            }else{
                numero[i]=numero[i-1];
            }
        }
        System.out.println("ARRAY FINAL");
        tabla(numero);
    }
}