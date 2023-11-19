/*
*Ejercicio 67 | Tema 5
*Escalera
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio67 {
    public static void main(String[] args) {
        System.out.print("Introduzca el número de escalones: ");
        int nesc=Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca la altura de los escalones: ");
        int alt=Integer.parseInt(System.console().readLine());
        String anch="";
        int j=0;
        System.out.println();
        for(int i=1;i<=nesc;i++){
            anch+="****";
            for(j=1;j<=alt;j++){
                System.out.print(anch);
                System.out.println();
            }
        }
    }
}
