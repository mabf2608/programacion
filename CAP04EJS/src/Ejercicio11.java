public class Ejercicio11 {
    public static void main(String[] args) {
        System.out.println("Introduce primero la hora que es y posteriormente los minutos: ");
        int hora = Integer.parseInt(System.console().readLine());
        int min = Integer.parseInt(System.console().readLine());
        int segs1 = ((hora * 60)*60)+min*60;
        int segs2 = 86400;

        if ((min >= 60) || (min < 0)){
            System.out.println("ERROR: Minutos mal indicados");
        }else{
            if ((hora > 24) || (hora < 0)){
            System.out.println("ERROR: Horas mal indicadas");
            }else{
                if ((segs1 == segs2)||(segs1 == 0)){
                System.out.println("Ya es media noche.");
                }else{
                    if (segs1 < segs2){
                    System.out.printf("Quedan %d segundos para la media noche. ",segs2-segs1);
                    }
                }
            }
        }
    }
}