/*
*Ejercicio 3 | Tema 7.1
*20 números enteros con math.random
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio3 {
    public static int[][] rellenar_matriz(int[][] numeros){
        int nummax=999;
        int nummin=100;
        int i;
        int j;
        for(i=0;i<4;i++){
            for(j=0;j<5;j++){
                numeros[i][j]=(int)(Math.random()*(nummax-nummin+1)+nummin);
            }
        }
        return numeros;
    }
    public static void crear_tabla(int[][] numeros){
        System.out.println();
        int i;
        int j;
        int suma_fila=0;
        int suma_columna=0;
        int suma_total=0;
        char barra='|';
        for(i=0;i<=3;i++){
            suma_fila=0;
            for(j=0;j<=4;j++){
                if (i>=0&&j==0){
                    System.out.printf("%8d",numeros[i][j]);
                }
                if(i>=0&&j>0){
                        System.out.printf("%8d",numeros[i][j]);
                }
                suma_fila+=numeros[i][j];
                suma_total+=numeros[i][j];
            }
            System.out.printf("%2s%7d",barra,suma_fila);
            System.out.println();
        }
        System.out.println("---------------------------------------------------");
        for(i=0;i<=4;i++){
            suma_columna=0;
            for(j=0;j<=3;j++){
                suma_columna+=numeros[j][i];
            }
            System.out.printf("%8d",suma_columna);
        }
        System.out.printf("%2s%7d%n",barra,suma_total);
    }
    public static void main(String[] args) {
        int[][] numeros=new int[4][5];
        rellenar_matriz(numeros);
        crear_tabla(numeros);
    }
}
