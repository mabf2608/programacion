/*
*Ejercicio 22 | Tema 6
*Serpenteo de serpiente
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio22 {
    public static void main(String[] args) {
        System.out.println();
        System.out.print("Introduzca la longitud de la serpiente en caracteres contando la cabeza: ");
        int longitudserp=Integer.parseInt(System.console().readLine());
        int j=0;
        int posicion=12;
        System.out.println();
        for(int i=1;i<=longitudserp;i++){
            if(i==1){
                for (j=1;j<=posicion;j++){
                    System.out.print(" ");
                }
                System.out.print("@");
            }else{
                int serpenteo=(int)(Math.random()*3+1);
                if (serpenteo==1)
                    posicion-=1;
                if (serpenteo==3)
                    posicion+=1;
                for (j=1;j<=posicion;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
