/*
*Ejercicio 14 | Tema 6
*Intenta adivinarme
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio14 {
    public static void main(String[] args) {
        System.out.println();
        boolean seguir=true;
        int min=1, max=100,i=0;
        
        while (seguir) {
            if(i==5){
                System.out.println();
                System.out.printf("He vuelto a fallar, la proxima vez será. :(");
                System.out.println();
                seguir=false;
            }else{
                int n=(int)((Math.random()*(max-min+1))+min-1);
                System.out.printf("He pensado en el número %d, ¿es correcto?. De no ser así indica si es mayor o menor%n",n);
                String res=System.console().readLine();
                switch (res.toUpperCase()) {
                    case "MAYOR":
                        min=n;
                        break;
                    case "MENOR":
                        max=n;
                        break;
                    case "SI":
                    case "CORRECTO":
                    System.out.println();
                        System.out.println("Genial! Me encanta jugar a esto.");
                        seguir=false;
                        break;
                    default:
                        System.out.println("Debes introducir un valor correcto.");
                        break;
                }
                i++;
            }
        }
    }
}
