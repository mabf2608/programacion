/*
*Ejercicio 29 | Tema 6
*Prevision del tiempo.
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio29 {
    
    public static void Prevision(int tmax, int tmin, int estacion){
        int temperaturamin=(int)(Math.random()*(tmax-tmin+1)+tmin);
        int temperaturamax=(int)(Math.random()*(tmax-temperaturamin+1)+temperaturamin);
        String cielo = "";
        if (estacion==1)
            cielo = Math.random() <= 0.6 ? "Soleado" : "Nublado";
        if (estacion==2)
            cielo = Math.random() <= 0.8 ? "Soleado" : "Nublado";
        if (estacion==3)
            cielo = Math.random() <= 0.4 ? "Soleado" : "Nublado";
        if (estacion==4)
            cielo = Math.random() <= 0.2 ? "Soleado" : "Nublado";
        System.out.println();
        System.out.println("PREVISIÓN DEL TIEMPO PARA MAÑANA: ");
        System.out.println("------------------------------------");
        System.out.printf("Temperatura mínima: %d ºC%n",temperaturamin);
        System.out.printf("Temperatura máxima: %d ºC%n",temperaturamax);
        System.out.println(cielo);
    }
    public static void main(String[] args) {
        System.out.println();
        System.out.println("1.- Primavera.");
        System.out.println("2.- Verano.");
        System.out.println("3.- Otoño.");
        System.out.println("4.- Invierno.");
        System.out.print("Seleccione la estación del año (1-4): ");
        System.out.println();
        int estacion=Integer.parseInt(System.console().readLine());
        int temperaturamax=0,temperaturamin=0;

        switch (estacion) {
            case 1:
                temperaturamax=30;
                temperaturamin=15;
                Prevision(temperaturamax, temperaturamin, estacion);
            break;
            case 2:
                temperaturamax=45;
                temperaturamin=25;
                Prevision(temperaturamax, temperaturamin, estacion);
            break;
            case 3:
                temperaturamax=30;
                temperaturamin=20;
                Prevision(temperaturamax, temperaturamin, estacion);
            break;
            case 4:
                temperaturamax=25;
                temperaturamin=0;
                Prevision(temperaturamax, temperaturamin, estacion);
            break;
            default:
            System.out.println("ERROR: Estación seleccionadad inexistente, vuelva a intentarlo con una correcta.");
            break;
        }
    }
}
