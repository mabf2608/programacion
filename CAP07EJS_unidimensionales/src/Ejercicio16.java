/*
*Ejercicio 16 | Tema 7
*Array múltiplos de 5 y 7.
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio16{
    public static void muestra_mult5(int[] numero){
        for(int i=0;i<20;i++){
            if (numero[i]%5==0){
                System.out.printf("[%d] ",numero[i]);
            }else{
                System.out.printf("%d ",numero[i]);
            }
        }
        System.out.println();
    }
    public static void muestra_mult7(int[] numero){
        for(int i=0;i<20;i++){
            if (numero[i]%7==0){
                System.out.printf("[%d] ",numero[i]);
            }else{
                System.out.printf("%d ",numero[i]);
            }
        }
        System.out.println();
    }
    public static void eleccion(int[] numero){
        System.out.println();
        System.out.println();
        System.out.print("¿Qué quiere destacar?(1-multiplos 5, 2-multiplos de 7): ");
        int opcion=Integer.parseInt(System.console().readLine());
        System.out.println();
        switch (opcion) {
            case 1:
                muestra_mult5(numero);
            break;
            case 2:
                muestra_mult7(numero);
            break;
            default:
                System.out.println("ERROR: Vuelve a introducir un número.");
                eleccion(numero);
            break;
        }
    }
    public static void main(String[] args) {
        int[] numero=new int[20];
        for(int i=0;i<20;i++){
            numero[i]=(int)(Math.random()*401);
        }
        System.out.println();
        for(int i=0;i<20;i++){
            System.out.printf("%d ",numero[i]);
        }
        eleccion(numero);
    }
}