package ejerciciosPOO.ejercicio6;

public class usoTiempo {
    public static void main(String[] args) {
        System.out.println();

        Tiempo t1=new Tiempo(10, 30, 14);
        Tiempo t2=new Tiempo(5, 60, 04);
        Tiempo t3=new Tiempo(1, 40, 55);

        System.out.println(t1.getHora());
        System.out.println(t2.getMinutos());
        System.out.println(t3.getSegundos());

        Tiempo.suma(t1, t2);
        Tiempo.resta(t2, t3);

        t1.toString();
    }
}
