/*
*Ejercicio 7 | Tema 6
*Quiniela
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio7 {
    public static String datopleno(int v1, String v2){
        switch (v1) {
            case 0:
            case 1:
            case 2:
                v2=""+v1;
            break;
            default:
                v2="M";
            break;
        }
        return v2;
    }
    public static String dato(int v1, String v2){
        switch (v1) {
            case 1:
                v2="1  ";
            break;
            case 2:
                v2=" X ";
            break;
            case 3:
                v2="  2";
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
            int c1=(int)(Math.random()*3+1),c2=(int)(Math.random()*3+1),c3=(int)(Math.random()*3+1);
            String dat1="",dat2="",dat3="";
            if (i<10){
                System.out.printf("Fila nº 0%d |%s|%s|%s|",i,dato(c1, dat1),dato(c2, dat2),dato(c3, dat3));
            }
            if (i>9&&i<15){
                System.out.printf("Fila nº %d |%s|%s|%s|",i,dato(c1, dat1),dato(c2, dat2),dato(c3, dat3));
            }
            if (i==15){
                int p1=(int)(Math.random()*3+1),p2=(int)(Math.random()*4);
                String dat4="",dat5="";
                System.out.println();
                System.out.printf("Pleno al nº %d |Local...%s|Visitante...%s|",i,datopleno(p1, dat4),datopleno(p2, dat5));
            }
        }
        System.out.println();
    }
}
