/*
*Ejercicio 2 | Tema 7.1
*20 números enteros a mano
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio2 {
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
            System.out.printf("%2s%6d",barra,suma_fila);
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
        System.out.printf("%2s%6d%n",barra,suma_total);
    }
    public static void main(String[] args) {
        int[][] numeros=new int[4][5];
        numeros[0][0]=11;
        numeros[0][1]=22;
        numeros[0][2]=33;
        numeros[0][3]=44;
        numeros[0][4]=55;
        numeros[1][0]=66;
        numeros[1][1]=77;
        numeros[1][2]=88;
        numeros[1][3]=99;
        numeros[1][4]=10;
        numeros[2][0]=20;
        numeros[2][1]=30;
        numeros[2][2]=40;
        numeros[2][3]=50;
        numeros[2][4]=60;
        numeros[3][0]=70;
        numeros[3][1]=80;
        numeros[3][2]=90;
        numeros[3][3]=100;
        numeros[3][4]=200;
        crear_tabla(numeros);
    }
}
