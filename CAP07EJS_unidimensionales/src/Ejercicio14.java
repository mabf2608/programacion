/*
*Ejercicio 14 | Tema 7
*Array Con 8 palabras Colores.
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio14 {
    public static String[] pedir_palabras(String[] palabras){
        for(int i=0;i<8;i++){
            System.out.printf("Palabra %d: ",i+1);
            palabras[i]=System.console().readLine();
        }
        return palabras;
    }
    public static void mezclar(String[] palabras, String[] colores){
        String[] palabras_colores=new String[8];
        String[] palabras_sin_colores=new String[8];
        int contador=0;
        int contador2=0;
        int i;
        int j;
        for(i=0;i<8;i++){
            for(j=0;j<9;j++){
                if(palabras[i].equals(colores[j])){
                    palabras_colores[contador]=palabras[i];
                    contador++;
                    j=9;
                }else{
                    if (j==8){
                        palabras_sin_colores[contador2]=palabras[i];
                        contador2++;
                    }
                }
            }
        }
        for(i=0;i<8;i++){
            if (i<contador){
                palabras[i]=palabras_colores[i];
            }else{
                palabras[i]=palabras_sin_colores[i-contador];
            }
        }
        leer(palabras);
    }
    public static void leer(String[] palabras){
        System.out.println();
        for(int i=0;i<8;i++){
            System.out.printf("%s ",palabras[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String[] colores=new String[9];
        colores[0]="verde";
        colores[1]="rojo";
        colores[2]="azul";
        colores[3]="amarillo";
        colores[4]="naranja";
        colores[5]="rosa";
        colores[6]="negro";
        colores[7]="blanco";
        colores[8]="morado";
        String[] palabras=new String[8];
        System.out.println();
        System.out.println("Introduce palabras: ");
        pedir_palabras(palabras);
        leer(palabras);
        mezclar(palabras, colores);
    }
}
