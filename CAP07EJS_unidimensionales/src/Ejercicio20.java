/*
*Ejercicio 21 | Tema 7
*Reyes
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio20 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Introduzca el número total de nombres de reyes: ");
        int numero_reyes=Integer.parseInt(System.console().readLine());
        int i;
        int j;
        String[] reyes=new String[numero_reyes];
        System.out.println("Vaya introduciendo los nombres de los reyes y pulsando ENTER: ");
        for(i=0;i<numero_reyes;i++){
            reyes[i]=System.console().readLine();
        }
        System.out.println();
        System.out.println("Los reyes introducidos son: ");
        System.out.println();
        for(i=0;i<numero_reyes;i++){
            int orden=1;
            for(j=0;j<i;j++){
                if(reyes[i].equals(reyes[j])){
                    orden++;
                }
            }
            System.out.printf("%s %dº%n",reyes[i],orden);
        }
    }
}
