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
        int carta=(int)(Math.random()*13+1);
        String tipoc="";
        switch (carta) {
            case 1:
                tipoc="A";
            break;
            case 2:
                tipoc="II";
            break;
            case 3:
                tipoc="III";
            break;
            case 4:
                tipoc="IV";
            break;
            case 5:
                tipoc="V";
            break;
            case 6:
                tipoc="VI";
            break;
            case 7:
                tipoc="VII";
            break;
            case 8:
                tipoc="VIII";
            break;
            case 9:
                tipoc="IX";
            break;
            case 10:
                tipoc="X";
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
