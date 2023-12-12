/*
*Ejercicio 18 | Tema 7
*Array forma alterna pares e impares.
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio18 {
    public static boolean espar(int n){
        boolean par=true;
        if(n%2!=0){
            par=false;
        }
        return par;
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
        System.out.println();
        int[] numero=new int[10];
        int[] par=new int[10];
        int[] nopar=new int[10];
        int pares=0,nopares=0;
        int i;
        for(i=0;i<10;i++){
            System.out.printf("Introduce el numero: %d: ",i+1);
            numero[i]=(int)(Math.random()*201);
            if (espar(numero[i])){
                par[pares]=numero[i];
                pares++;
            }else{
                nopar[nopares]=numero[i];
                nopares++;
            }
        }
        System.out.println();
        System.out.println("Array Inicial");
        tabla(numero);
        System.out.println();
        System.out.println("Array Final");
        int cont1=0;
        int cont2=0;
        for (i=0;i<10;i++){
            if (i%2==0&&cont1<pares||nopares==cont2){;
                numero[i]=par[cont1];
                cont1++;
            }
            if (i%2!=0&&cont2<nopares||pares<cont1){
                numero[i]=nopar[cont2];
                cont2++;
            }
        }
        tabla(numero);
    }
}