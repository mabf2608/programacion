/*
*Ejercicio 18 | Tema 6
*Dormitorios de colores
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio18 {
    public static String color(int v1){
        String v2="";
        switch (v1) {
            case 1:
                v2="rojo";
            break;
            case 2:
                v2="azul";
            break;
            case 3:
                v2="verde";
            break;
            case 4:
                v2="amarillo";
            break;
            case 5:
                v2="violeta";
            break;
            case 6:
                v2="naranja";
            break;
            default:
                break;
        }
        return v2;
    }
    public static void main(String[] args) {
        System.out.println();
        int ale1=(int)(Math.random()*6+1),ale2=0,ale3=0;
        String color1=color(ale1),color2="",color3="";
        boolean seguir=true;
        while (seguir) {
            ale2=(int)(Math.random()*6+1);
            color2=color(ale2);
            if (!color2.equals(color1)){
                seguir=false;
            }
        }
        seguir=true;
         while (seguir) {
            ale3=(int)(Math.random()*6+1);
            color3=color(ale3);
            if (!color3.equals(color1)&&!color3.equals(color2)){
                seguir=false;
            }
        }
        System.out.printf("Los colores para los dormitorios son: %s, %s y %s.%n",color1,color2,color3);
    }
}