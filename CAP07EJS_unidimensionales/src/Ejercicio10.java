/*
*Ejercicio 10 | Tema 7
*Arrays Auxiliares.
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio10 {
    public static void main(String[] args) {
        System.out.println();
        int[] numero=new int[20];
        int[] par=new int[20];
        int[] impar=new int[20];
        int i,pares=0,impares=0;
        for (i=0;i<20;i++){
            numero[i]=(int)(Math.random()*101);
            if (numero[i]%2==0){
                par[pares]=numero[i];
                pares++; 
            }else{
                impar[impares]=numero[i];
                impares++;
            }
            System.out.print(numero[i]+" ");
        }
        System.out.println();
        System.out.println();
        for (i=0;i<20;i++){
            if (i<pares){;
                numero[i]=par[i];
            }else{
                numero[i]=impar[i-pares];
            }
            System.out.print(numero[i]+" ");
        }
        System.out.println();
    }
}
