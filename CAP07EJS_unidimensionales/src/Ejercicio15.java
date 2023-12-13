/*
*Ejercicio 15 | Tema 7
*Comensales restaurante.
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio15 {
    public static int[] rellena_mesas(int[] ocupacion_mesas){
        int i;
        for(i=0;i<10;i++){
            ocupacion_mesas[i]=(int)(Math.random()*5);
        }
        return ocupacion_mesas;    
    }
    public static void decidir_mesa(int[] ocupacion_mesas, int limite, int cantidad_comensales){
        int i;
        if(cantidad_comensales>4){
            System.out.println("Lo siento, no admitimos grupos de 6, haga grupos de 4 personas como máximo e intente de nuevo.");
        }else{
            int contador=0;
            for(i=0;i<10;i++){
                if (ocupacion_mesas[i]==0){
                    contador++;
                }
            }
            if(contador>0){
                for(i=0;i<10;i++){
                    if ((ocupacion_mesas[i]==0)){
                        System.out.printf("Por favor, siéntese en la mesa nº %d.%n",i+1);
                        ocupacion_mesas[i]+=cantidad_comensales;
                        break;
                    }else{
                        if ((limite-ocupacion_mesas[i])<=cantidad_comensales&&i==9){
                            System.out.println();
                            System.out.println("Lo siento, en estos momentos no queda sitio.");
                        }
                    }
                }
            }else{
                for(i=0;i<10;i++){
                    if ((limite-ocupacion_mesas[i])>=cantidad_comensales){
                        System.out.printf("Tendrán que compartir mesa. Por favor, siéntese en la mesa nº %d.%n",i+1);
                        ocupacion_mesas[i]+=cantidad_comensales;
                        break;
                    }else{
                        if ((limite-ocupacion_mesas[i])<=cantidad_comensales&&i==9){
                            System.out.println();
                            System.out.println("Lo siento, en estos momentos no queda sitio.");
                        }
                    }
                }
            }
        }
        tabla(ocupacion_mesas);
    }
    public static void tabla(int[] ocupacion_mesas){
        System.out.println();
        int i;
        for(i=0;i<10;i++){
            if (i==0){
                System.out.printf("-------------------------------------------------------------------------%n");
                System.out.printf("| Mesa nº   |%3d  |",i+1);
            }else{
                System.out.printf("%3d  |",i+1);
            }
        }
        System.out.println();
        for(i=0;i<10;i++){
            if (i==0){
                System.out.printf("-------------------------------------------------------------------------%n");
                System.out.printf("| Ocupación |%3d  |",ocupacion_mesas[i]);
            }else{
                System.out.printf("%3d  |",ocupacion_mesas[i]);
            }
        }
        System.out.println();
        System.out.println("-------------------------------------------------------------------------");
    }
    public static void main(String[] args) {
        int[] ocupacion_mesas=new int[10];
        int limite=4;
        rellena_mesas(ocupacion_mesas);
        tabla(ocupacion_mesas);
        System.out.println();
        int contador=0;
        do{
            System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
            System.out.println();
            int cantidad_comensales=Integer.parseInt(System.console().readLine());
            if (cantidad_comensales==-1){
                System.out.println("Gracias, hasta pronto.");
                contador=-1;
            }
            decidir_mesa(ocupacion_mesas,limite,cantidad_comensales);
        }while(contador!=-1);
    }
}