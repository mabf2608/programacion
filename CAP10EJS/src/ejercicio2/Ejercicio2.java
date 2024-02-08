package ejercicio2;

import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> valores = new ArrayList<Integer>();
        int numElements=(int)(Math.random()*11+10);
        for(int i=0;i<numElements;i++){
            valores.add((int)(Math.random()*101));
        }
        int suma=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        System.out.println();
        for(Integer valor:valores){
            suma+=valor;
            min=Math.min(min, valor);
            max=Math.max(max, valor);
        }
        System.out.printf("Media: %.2f%n", (double)suma/valores.size());
        System.out.printf("Mínimo: %d%n", min);
        System.out.printf("Máximo: %d%n", max);
    }
}
