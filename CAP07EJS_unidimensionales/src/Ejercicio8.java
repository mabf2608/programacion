/*
*Ejercicio 8 | Tema 7
*Temperatura media.
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Introduce la temperatura de cada mes del año: ");
        int[] mes=new int[12];
        for(int i=0;i<12;i++){
            System.out.printf("Temperatura del mes %d: ",i+1);
            mes[i]=Integer.parseInt(System.console().readLine());
        }
        System.out.println();
        System.out.println("Diagrama de barras horizontal: ");
        System.out.println();
        for(int i=0;i<12;i++){
            for(int j=1;j<=mes[i];j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
