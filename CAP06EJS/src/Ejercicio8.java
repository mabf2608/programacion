/*
*Ejercicio 8 | Tema 6
*Quiniela mejorada
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio8 {
    public static String dato(int v1, String v2){
        switch (v1) {
            case 1:
            case 2:
            case 3:
                v2="1";
            break;
            case 4:
            case 5:
                v2="X";
            break;
            case 6:
                v2="2";
            break;
            default:
                break;
        }
        return v2;
    }
    public static void main(String[] args) {
        System.out.println();
        for (int i=1;i<=15;i++){
            System.out.println();
            int c1=(int)(Math.random()*6+1),c2=(int)(Math.random()*6+1),c3=(int)(Math.random()*6+1);
            String dat1="",dat2="",dat3="";
            if (i<10){
                System.out.printf("Fila nº 0%d |%s|%s|%s|",i,dato(c1, dat1),dato(c2, dat2),dato(c3, dat3));
            }
            if (i>9&&i<15){
                System.out.printf("Fila nº %d |%s|%s|%s|",i,dato(c1, dat1),dato(c2, dat2),dato(c3, dat3));
            }
            if (i==15){
                System.out.println();
                System.out.printf("Pleno al nº %d |%s|%s|%s|",i,dato(c1, dat1),dato(c2, dat2),dato(c3, dat3));
            }
        }
        System.out.println();
    }
}
