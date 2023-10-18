public class Ejercicio22 {
    public static void main(String[] args) {
        try {
            System.out.println();
            System.out.println("Introduce un día de la semana para saber cuanto queda para el fin de semana (de Lunes a Viernes): ");
            String x = System.console().readLine();
            System.out.println("Introduce la hora: ");
            int hora = Integer.parseInt(System.console().readLine());
            System.out.println("Introduce los minutos: ");
            int min = Integer.parseInt(System.console().readLine());
            int mins = 6660;
            int q,t;
            String dia = x.toUpperCase();
            System.out.println();
            if ((hora >= 0 && hora < 24) || (min >=0 && min < 60) || (dia.equals("VIERNES")&&(hora>=0 && hora <=14))){
                switch (dia){
                case "LUNES":
                t = (hora*60)+min;
                q = mins-t;
                System.out.printf("Quedan un total de %d minutos para llegar al fin de semana.%n",q);
                break;
                case "MARTES":
                t = (hora*60)+min+(24*60);
                q = mins-t;
                System.out.printf("Quedan un total de %d minutos para llegar al fin de semana.%n",q);
                break;
                case "MIERCOLES":
                t = (hora*60)+min+((24*2)*60);
                q = mins-t;
                System.out.printf("Quedan un total de %d minutos para llegar al fin de semana.%n",q);
                break;
                case "JUEVES":
                t = (hora*60)+min+((24*3)*60);
                q = mins-t;
                System.out.printf("Quedan un total de %d minutos para llegar al fin de semana.%n",q);
                break;
                case "VIERNES":
                t = (hora*60)+min+((24*4)*60);
                q = mins-t;
                System.out.printf("Quedan un total de %d minuto/s para llegar al fin de semana.%n",q);
                break;
                default:
                break;
            }
        }else{
            System.out.println("Día, hora o minutos introducidos incorrectos, vuelva a intentarlo.");
        }
        } catch (Exception e) {
            System.out.println();
            System.out.println("Algo ha salido mal, intentalo más tarde.");
        }
    }
}
