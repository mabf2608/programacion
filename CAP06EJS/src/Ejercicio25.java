/*
*Ejercicio 25 | Tema 6
*Numeros primos, multiplos de 5 aleatorios del 10 al 200
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio25 {
    public static boolean esPrimo(int numeroaleatorio){
        boolean primo = true;
        for(int i=2;i<=numeroaleatorio/2;i++){
            if (numeroaleatorio%i==0){
                primo=false;
            }
        }
        return primo;
    }
    public static void main(String[] args) {
        System.out.println();
        int valormax=200;
        int valormin=10;
        for(int i=1;i<=100;i++){
            int numeroaleatorio=(int)((Math.random()*(valormax-valormin+1))+valormin);
            if (numeroaleatorio%5==0){
                System.out.printf("[%d] ",numeroaleatorio);
            }else{
                if (esPrimo(numeroaleatorio)){
                    System.out.printf("#%d# ",numeroaleatorio);
                }else{
                    System.out.printf("%d ",numeroaleatorio);
                }
            }
        }
        System.out.println();
    }
}