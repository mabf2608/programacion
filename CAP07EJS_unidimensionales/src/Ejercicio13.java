/*
*Ejercicio 11 | Tema 7
*Arrays Auxiliares Primos.
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio13{
    public static void muestra_minimo(int[] numero, int posmin){
        for(int i=0;i<100;i++){
            if (i==posmin){
                System.out.printf("**%d** ",numero[i]);
            }
            else{
                System.out.printf("%d ",numero[i]);
            }
        }
        System.out.println();
    }
    public static void muestra_maximo(int[] numero, int posmax){
        for(int i=0;i<100;i++){
            if (i==posmax){
                System.out.printf("**%d** ",numero[i]);
            }
            else{
                System.out.printf("%d ",numero[i]);
            }
        }
        System.out.println();
    }
    public static void eleccion(int[] numero, int posmax, int posmin){
        System.out.println();
        System.out.println();
        System.out.print("¿Qué quiere destacar?(1-mínimo, 2-máximo): ");
        int opcion=Integer.parseInt(System.console().readLine());
        switch (opcion) {
            case 1:
                muestra_minimo(numero, posmin);
            break;
            case 2:
                muestra_maximo(numero, posmax);
            break;
            default:
                System.out.println();
                System.out.println("ERROR: Vuelve a introducir un número.");
                eleccion(numero, posmax, posmin);
            break;
        }
    }
    public static void main(String[] args) {
        int[] numero=new int[100];
        int nummax=Integer.MIN_VALUE;
        int nummin=Integer.MAX_VALUE;
        int posmin=0;
        int posmax=0;
        for(int i=0;i<100;i++){
            numero[i]=(int)(Math.random()*501);
            if (numero[i]>nummax){
                nummax=numero[i];
                posmax=i;
            }
            if (numero[i]<nummin){
                nummin=numero[i];
                posmin=i;
            }
        }
        System.out.println();
        for(int i=0;i<100;i++){
            System.out.printf("%d ",numero[i]);
        }
        eleccion(numero, posmax, posmin);
    }
}