/*Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
dos asteriscos menos en la base para simular la curvatura de las esquinas
inferiores.
 */

public class Ejercicio33 {
    public static void u(int v1){
        char ast = '*';
        char esp = ' ';
        int i,j;
        for (i=1;i<=v1;i++){
            System.out.println();
            if(i>=1 && i<=v1-1){
                for(j=1; j<=v1;j++){
                    if(j==1 || j ==v1){
                        System.out.print(""+ast+esp);
                    }else{
                        System.out.print(""+esp+esp);
                    }
                }
            }else{
                for(j=1; j<=v1;j++){
                    if(j==1 || j==v1){
                        System.out.print(""+esp+esp);
                    }else{
                        System.out.print(""+ast+esp);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.print("Introduzca la altura de la letra U: ");
        int a = Integer.parseInt(System.console().readLine());
        u(a);
    }
}

