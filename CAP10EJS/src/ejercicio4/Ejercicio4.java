package ejercicio4;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio4 {
    public static String textoAleatorio(int longitud){
        String texto="";
        for(int i=0;i<longitud;i++){
            texto+=(char)((int)(Math.random()*26+65));
        }
        return texto;
    }
    public static void main(String[] args) {
        ArrayList<String> valores = new ArrayList<String>();
        int numElements=(int)(Math.random()*11+10);
        for(int i=0;i<numElements;i++){
            valores.add(textoAleatorio(10));
        }
        System.out.println("Lista sin ordenar: ");
        for(String valor:valores){
            System.out.print(valor+",");
        }
        System.out.println();
        Collections.sort(valores);
        System.out.println("Lista ordenada: ");
        for(String valor:valores){
            System.out.print(valor+",");
        }
    }
}
