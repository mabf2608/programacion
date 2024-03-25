/*
*Ejercicio 1 | Tema 9 - Arrays Objetos
*Gatos 1.
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/

package ejerciciosArraysObjetos.ejercicio1;

public class usoGato {
    public static void main(String[] args) {
        String nombre, color;
        int patas;

        Gato[] gatos =new Gato[5];

        for (int i=0; i<gatos.length;i++){
            System.out.println();
            System.out.println("Introduce el nombre del gato: ");
            nombre=System.console().readLine();
            System.out.println("Introduce la cantidad de patas del gato: ");
            patas=Integer.parseInt(System.console().readLine());
            System.out.println("Introduce el color del gato: ");
            color=System.console().readLine();
            gatos[i]=new Gato(nombre, patas, color);
        }

        for (int i=0;i<gatos.length;i++){
            System.out.println("Gato número "+i+": ");
            System.out.println(gatos[i]);
            System.out.println();
        }
    }
}
