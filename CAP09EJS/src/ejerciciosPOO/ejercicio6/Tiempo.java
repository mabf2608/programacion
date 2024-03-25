package ejerciciosPOO.ejercicio6;

/*
*Ejercicio 6 | Tema 9
*Implementa la clase Tiempo con los datos indicados.
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/

public class Tiempo {
    private int horas;
    private int minutos;
    private int segundos;

    public Tiempo(){
        horas=0;
        minutos=0;
        segundos=0;
    }

    public Tiempo(int horas, int minutos, int segundos){
        this.horas=horas;
        this.minutos=minutos;
        this.segundos=segundos;
    }

    public void setHora(int horas){
        this.horas=horas;
    }

    public void setMinutos(int minutos){
        this.minutos=minutos;
    }

    public void setSegundos(int segundos){
        this.segundos=segundos;
    }

    public int getHora(){
        return horas;
    }

    public int getMinutos(){
        return minutos;
    }

    public int getSegundos(){
        return segundos;
    }

    public static void suma(Tiempo h1, Tiempo h2){
        int hora=h1.horas+h2.horas;
        int minuto=h1.minutos+h2.minutos;
        int segundo=h1.segundos+h2.segundos;

        while(segundo>60){
            segundo-=60;
            minuto++;
        }

        while(minuto>60){
            minuto-=60;
            hora++;
        }

        System.out.printf("%dh, %dm, %ds%n", hora, minuto, segundo);
    }

    public static void resta(Tiempo h1, Tiempo h2){
        int hora=h1.horas-h2.horas;
        int minuto=h1.minutos-h2.minutos;
        int segundo=h1.segundos-h2.segundos;

        while(segundo<0){
            segundo+=60;
            minuto--;
        }

        while(minuto<0){
            minuto+=60;
            hora--;
        }
        System.out.printf("%dh, %dm, %ds%n", hora, minuto, segundo);
    }

    @Override
    public String toString() {
        return String.format("%d h, %d min, %d segs", horas, minutos, segundos);
    }
}
