/*
*Ejercicio 2 | Tema 9 - Arrays Objetos
*Gatos 2.
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/

package ejerciciosArraysObjetos.ejercicio2;

public class usoGato {
    public static void main(String[] args) {

        Gato[] gatos =new Gato[5];

        gatos[0]=new Gato("Nini", 4, "Naranja");
        gatos[1]=new Gato("Kiko", 4, "Negro");
        gatos[2]=new Gato("Sira", 4, "Blanco");
        gatos[3]=new Gato("Garfield", 4, "Naranja");
        gatos[4]=new Gato("Yuumi", 2, "Morado");


        for (int i=0;i<gatos.length;i++){
            System.out.println("Gato número "+i+": ");
            System.out.println(gatos[i]);
            System.out.println();
        }
    }
}
