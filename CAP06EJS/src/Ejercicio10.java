/*
*Ejercicio 10 | Tema 6
*Líneas de caracteres
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio10 {
    public static void main(String[] args) {
        System.out.println();
        int i=0,j=0,n=0;
        char c =' ';
        for (i=1;i<=4;i++){
            n=(int)(Math.random()*6);
            switch (n) {
                case 0:
                    c='*';
                break;
                case 1:
                    c='-';
                break;
                case 2:
                    c='=';
                break;
                case 3:
                    c='.';
                break;
                case 4:
                    c='|';
                break;
                case 5:
                    c='@';
                break;
                default:
            }
            n=(int)(Math.random()*40);
            for(j=0;j<=n;j++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
