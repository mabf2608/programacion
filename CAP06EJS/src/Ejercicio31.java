/*
*Ejercicio 31 | Tema 6
*Craps
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio31 {
    public static Integer tirada(){
        int tiro=0;
        for (int i=1;i==1;i++){
            tiro=(int)(Math.random()*6+1);
        }
        return tiro;
    }
    public static void segundafase(int suma1, int dineroapostado){
        System.out.println("----------------------------------------------------------");
        System.out.println("                  SEGUNDA ETAPA DEL JUEGO                 ");
        System.out.println("----------------------------------------------------------");
        boolean seguir=true;
        int suma2=0,dado1=0,dado2=0;
        while (seguir) {
            dado1=tirada();
            dado2=tirada();
            suma2=dado1+dado2;
            System.out.printf("El resultado del primer dado es %d.%n",dado1);
            System.out.printf("El resultado del segundo dado es %d.%n",dado2);
            System.out.printf("La suma de ambos es %d.%n",suma2);
            System.out.println("----------------------------------------------------------");
            if (suma1==suma2){
                System.out.println("FIN DEL JUEGO, HAS GANADO");
                System.out.printf("Recompensa: %d €.%n",dineroapostado*2);
                seguir=false;
            }
            if (suma2==7){
                System.out.println("FIN DEL JUEGO, HAS PERDIDO");
                System.out.printf("Recompensa: %d €.%n",dineroapostado*0);
                seguir=false;
            }
        }
    }
    public static void primerafase(int dineroapostado){
        System.out.println("----------------------------------------------------------");
        System.out.println("                  PRIMERA ETAPA DEL JUEGO                 ");
        System.out.println("----------------------------------------------------------");
        int dado1=tirada();
        int dado2=tirada();
        int suma1=dado1+dado2;
        System.out.printf("El resultado del primer dado es %d.%n",dado1);
        System.out.printf("El resultado del segundo dado es %d.%n",dado2);
        System.out.printf("La suma de ambos es %d.%n",suma1);
        if (suma1==7||suma1==11){
            System.out.println("----------------------------------------------------------");
            System.out.println("FIN DEL JUEGO, HAS GANADO");
            System.out.printf("Recompensa: %d €.%n",dineroapostado*2);
        }else{
            if (suma1==2||suma1==3||suma1==12){
                System.out.println("----------------------------------------------------------");
                System.out.println("FIN DEL JUEGO, HAS PERDIDO");
                System.out.printf("Recompensa: %d €.%n",dineroapostado*0);
            }else{
                segundafase(suma1,dineroapostado);
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.println();
        System.out.println("----------------------------------------------------------");
        System.out.print("Bienvenido a CRAPS, introduzca el dinero que desea apostar: ");
        int dineroapostado=Integer.parseInt(System.console().readLine());
        primerafase(dineroapostado);
    }
}
