/*
*Ejercicio 5 | Tema 7.1
*Tabla matriz con máximo y mínimo sin repetir numeros
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio6 {
    public static boolean recorrer_matriz(int[][] numeros,int numero, int v1, int v2){
        boolean se_repite=true;
        int i;
        int j;
        for(i=0;i<=v1;i++){
            for(j=0;j<v2;j++){
                if(numero!=numeros[i][j]){
                    se_repite=false;
                    break;
                }
            }
        }
        return se_repite;
    }
    public static int[][] rellenar_matriz(int[][] numeros){
        int nummax=1000;
        int nummin=0;
        int i;
        int j;
        for(i=0;i<6;i++){
            for(j=0;j<10;j++){
                boolean seguir=true;
                while(seguir){
                    numeros[i][j]=(int)(Math.random()*(nummax-nummin+1)+nummin);
                    if ((i==0&&j==0)||!recorrer_matriz(numeros,numeros[i][j],i,j)){
                        seguir=false;
                    }
                }
            }
        }
        return numeros;
    }
    public static void crear_tabla(int[][] numeros){
        System.out.println();
        int i;
        int j;
        for(i=-1;i<6;i++){
            for(j=-1;j<10;j++){
                if (i==-1&&j==0){
                    System.out.printf("%7d",j);
                }
                if (i==-1&&j>0){
                    System.out.printf("%8d",j);
                }
                if (i>=0&&j==-1){
                    System.out.printf("%d|",i);
                }
                if (i>=0&&j==0){
                    System.out.printf("%6d",numeros[i][j]);
                }
                if(i>=0&&j>0){
                        System.out.printf("%8d",numeros[i][j]);
                }
            }
            System.out.println();
            if(i==-1){
                System.out.println("--------------------------------------------------------------------------------");
            }
        }
    }
    public static void main(String[] args) {
        int[][] numeros=new int[6][10];
        int i;
        int j;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int posicion_y_max=0;
        int posicion_x_max=0;
        int posicion_y_min=0;
        int posicion_x_min=0;
        rellenar_matriz(numeros);
        for(i=0;i<6;i++){
            for(j=0;j<10;j++){
                if(numeros[i][j]>max){
                    max=numeros[i][j];
                    posicion_y_max=i;
                    posicion_x_max=j;
                }
                if(numeros[i][j]<min){
                    min=numeros[i][j];
                    posicion_y_min=i;
                    posicion_x_min=j;
                }
            }
        }
        crear_tabla(numeros);
        System.out.println("--------------------------------------------------------------------------------");
        System.out.printf("El máximo es %d y está en la fila %d, columna %d.%n",max,posicion_y_max,posicion_x_max);
        System.out.printf("El mínimo es %d y está en la fila %d, columna %d.%n",min,posicion_y_min,posicion_x_min);
    }
}