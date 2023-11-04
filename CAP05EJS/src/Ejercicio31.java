/*Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
mitad (división entera entre 2) de la altura más uno.
Ejemplo:
Introduzca la altura de la L: 5
*
*
*
*
* * *
*/

public class Ejercicio31 {
    public static void L(int v1){
        int i=1;
        while (i<=v1){
            char ast='*';
            if(i<v1){
                System.out.println(ast);
            }else{
                for (int j=0; j<=v1/2 ; j++){
                System.out.print(ast+" ");
                }
            }
            i++;
        }
    }
    public static void main(String[] args) {
        try{
            System.out.println();
            System.out.print("Introduzca la altura de la L: ");
            int a = Integer.parseInt(System.console().readLine());
            System.out.println();
            if (a<0){
                System.out.println("ERROR: El número introducido debe ser uno positivo.");
            }else{
                L(a);
            }
        }catch (Exception e){
            System.out.println();
            System.out.println("ERROR: Introduce un número entero.");
        }
    }
}
