/*
*Ejercicio 23 | Tema 6
*Dado de Poker
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio23 {
    public static String figura(int numale){
        switch (numale) {
            case 0:
                return "As ";
            case 1:
                return "K ";
            case 2:
                return "Q ";
            case 3:
                return "J ";
            case 4:
                return "7 ";
            case 5:
                return "8 ";
            default:
                return "";
        }
    }
    public static void main(String[] args) {
        System.out.println();
        for(int i=1;i<=5;i++){
            int numale=(int)(Math.random()*6);
            System.out.print(figura(numale));
        }
        System.out.println();
    }
}
