/*
*Ejercicio 18 | Tema 7
*Array forma alterna.
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio18 {
    public static boolean esmenor_100(int n){
        boolean menor_100=true;
        if(n>100){
            menor_100=false;
        }
        return menor_100;
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
        int[] menor_100=new int[10];
        int[] mayor_100=new int[10];
        int menores=0,mayores=0;
        int i;
        for(i=0;i<10;i++){
            numero[i]=(int)(Math.random()*201);
            if (esmenor_100(numero[i])){
                menor_100[menores]=numero[i];
                menores++;
            }else{
                mayor_100[mayores]=numero[i];
                mayores++;
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
            if (i%2==0&&cont1<menores||cont2>=mayores){
                numero[i]=menor_100[cont1];
                cont1++;
            }else{
                numero[i]=mayor_100[cont2];
                cont2++;
            }
        }
        tabla(numero);
    }
}