package ejercicio3;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> valores = new ArrayList<Integer>();
        int numElements=(int)(Math.random()*11+10);
        for(int i=0;i<numElements;i++){
            valores.add((int)(Math.random()*101));
        }
        System.out.println("Lista sin ordenar: ");
        for(Integer valor:valores){
            System.out.print(valor+",");
        }
        System.out.println();
        System.out.println();
        Collections.sort(valores);
        System.out.println("Lista ordenada: ");
        for(Integer valor:valores){
            System.out.print(valor+",");
        }
    }
}
