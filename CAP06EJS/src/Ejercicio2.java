/*
*Ejercicio 2 | Tema 6
*Baraja francesa
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println();
        int baraja=(int)(Math.random()*4);
        String tipob="";
        int carta=(int)(Math.random()*13+1);
        String tipoc="";
        switch (baraja) {
            case 0:
                tipob="picas";
            break;
            case 1:
                tipob="corazones";
            break;
            case 2:
                tipob="diamantes";
            break;
            case 3:
                tipob="tréboles";
            break;
            default:
        }
        switch (carta) {
            case 1:
                tipoc="A";
            break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                tipoc=carta+"";
            break;
            case 11:
                tipoc="J";
            break;
            case 12:
                tipoc="Q";
            break;
            case 13:
                tipoc="K";
            break;
            default:
        }
        System.out.printf("La carta que te ha salido es el %s de %s.%n",tipoc,tipob);
    }
}
