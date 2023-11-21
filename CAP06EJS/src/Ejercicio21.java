/*
*Ejercicio 21 | Tema 6
*Monedas cara cruz
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio21 {
    public static String lanzarmoneda(int numale){
        switch (numale) {
            case 1:
                return "cara";
            case 2:
                return "cruz";
            default:
                return "";
        }
    }
    public static void numalemoneda(String tipomoneda){
        int numale=(int)(Math.random()*2+1);
        String resultadomoneda=lanzarmoneda(numale);
        System.out.printf("%s - %s.%n",tipomoneda,resultadomoneda);
    }
    public static void main(String[] args) {
        String mon1="1 céntimo",mon2="2 céntimos",mon3="20 céntimos",mon4="50 céntimos",mon5="1 euro",mon6="2 euros";
        System.out.println();
        numalemoneda(mon1);numalemoneda(mon2);numalemoneda(mon3);numalemoneda(mon4);numalemoneda(mon5);numalemoneda(mon6);
    }
}