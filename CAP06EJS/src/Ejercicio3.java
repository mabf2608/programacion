/*
*Ejercicio 3 | Tema 6
*Baraja española
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println();
        int baraja=(int)(Math.random()*4);
        String tipob="";
        switch (baraja) {
            case 0:
                tipob="espadas";
            break;
            case 1:
                tipob="bastos";
            break;
            case 2:
                tipob="oros";
            break;
            case 3:
                tipob="copas";
            break;
            default:
        }
        int carta=(int)(Math.random()*10+1);
        String tipoc="";
        switch (carta) {
            case 1:
                tipoc="as";
            break;
            case 2:
                tipoc="2";
            break;
            case 3:
                tipoc="3";
            break;
            case 4:
                tipoc="4";
            break;
            case 5:
                tipoc="5";
            break;
            case 6:
                tipoc="6";
            break;
            case 7:
                tipoc="7";
            break;
            case 8:
                tipoc="sota";
            break;
            case 9:
                tipoc="caballo";
            break;
            case 10:
                tipoc="rey";
            break;
            default:
        }
        System.out.printf("La carta que te ha salido es el '%s' de '%s'.%n",tipoc,tipob);
    }
}
