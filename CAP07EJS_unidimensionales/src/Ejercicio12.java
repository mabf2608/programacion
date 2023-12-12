/*
*Ejercicio 12 | Tema 7
*Arrays inicio final.
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio12 {
    public static int[] mover_numeros(int[] numeros,int pos_inicial, int pos_final){
        int i;
        int aux_numcamb=numeros[pos_inicial];
        int aux_ult=numeros[9];
        for(i=9;i>=pos_final;i--){
            if (i==pos_final){
                numeros[i]=aux_numcamb;
            }else{
                numeros[i]=numeros[i-1];
            }
        }
        for(i=pos_inicial;i>=0;i--){
            if (i==0){
                numeros[i]=aux_ult;
            }else{
                numeros[i]=numeros[i-1];
            }
        }
        return numeros;
    }
    public static void tabla(int[] numero){
        int i;
        for(i=0;i<10;i++){
            if (i==0){
                System.out.printf("--------------------------------------------------------------------------------%n");
                System.out.printf("| Índice |%3d   |",i);
            }else{
                System.out.printf("%3d   |",i);
            }
        }
        System.out.println();
        for(i=0;i<10;i++){
            if (i==0){
                System.out.printf("--------------------------------------------------------------------------------%n");
                System.out.printf("| Valor  |%3d   |",numero[i]);
            }else{
                System.out.printf("%3d   |",numero[i]);
            }
        }
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------");
    }
    public static void main(String[] args) {
        int[] numeros=new int[10];
        int i;
        System.out.println("Introduce los números por teclado: ");
        for(i=0;i<10;i++){
            numeros[i]=Integer.parseInt(System.console().readLine());
        }
        System.out.println();
        System.out.println("ARRAY INICIAL: ");
        tabla(numeros);
        boolean seguir=true;
        int pos_inicial=0, pos_final=0;
        System.out.println();
        while (seguir) {
            System.out.print("Introduce la posición inicial: ");
            pos_inicial=Integer.parseInt(System.console().readLine());
            System.out.print("Introduce la posición final: ");
            pos_final=Integer.parseInt(System.console().readLine());
            if(pos_final<pos_inicial||pos_inicial<0||pos_final>=10){
                System.out.println();
                System.out.println("ERROR: La posición inicial debe ser menor y ambas deben estar entre 0 y 9.");
                System.out.println();
            }else{
                seguir=false;
            }
        }
        System.out.println();
        numeros=mover_numeros(numeros,pos_inicial,pos_final);
        System.out.println("ARRAY FINAL: ");
        tabla(numeros);
    }
}
