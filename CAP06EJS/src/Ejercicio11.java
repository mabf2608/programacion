/*
*Ejercicio 10 | Tema 6
*Líneas de caracteres
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio11 {
    public static void main(String[] args) {
        System.out.println();
        int sus=0,suf=0,bi=0,not=0,sob=0;
        String nota ="";
        for (int i=1;i<=20;i++){
            int n=(int)(Math.random()*5d);
            switch (n) {
                case 0:
                    nota="Suspenso";
                    sus++;
                break;
                case 1:
                    nota="Suficiente";
                    suf++;
                break;
                case 2:
                    nota="Bien";
                    bi++;
                break;
                case 3:
                    nota="Notable";
                    not++;
                break;
                case 4:
                    nota="Sobresaliente";
                    sob++;
                break;
                default:
            }
            System.out.printf("El alumno nº %d ha sacado un %s.%n",i,nota);
        }
        System.out.println();
        System.out.printf("Ha habido un total de %d de Suspensos.%n",sus);
        System.out.printf("Ha habido un total de %d de Suficientes.%n",suf);
        System.out.printf("Ha habido un total de %d de Bien.%n",bi);
        System.out.printf("Ha habido un total de %d de Notables.%n",not);
        System.out.printf("Ha habido un total de %d de Sobresalientes.%n",sob);
    }
}
