/*
*Ejercicio 17 | Tema 7
*Array rotar según número introducido.
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio17 {
    public static void main(String[] args) {
        int i;
        int n=0;
        int posicion=0;
        int[] numero=new int[10];
        for(i=0;i<10;i++){
            numero[i]=(int)(Math.random()*101);
        }
        System.out.println();
        for(i=0;i<10;i++){
            System.out.printf("%d ",numero[i]);
        }
        System.out.println();
        boolean seguir=true;
        while (seguir) {
            System.out.println();
            System.out.print("Introduce un número de los mostrados arriba: ");
            n=Integer.parseInt(System.console().readLine());
            for(i=0;i<10;i++){
                if(n==numero[i]){
                    seguir=false;
                    posicion=i;
                    break;
                }else{
                    if(i==9){
                        System.out.print("ERROR: Introduce un valor válido.");
                        System.out.println();
                    }
                }
            }
        }
        int veces_a_rotar=10-posicion;
        int contador=1,aux=0;
        while(contador<=veces_a_rotar){
            aux=numero[9];
            for(i=9;i>=0;i--){
                if (i==0){
                    numero[0]=aux;
                }else{
                    numero[i]=numero[i-1];
                }
            }
            contador++;
        }
        System.out.println();
        for(i=0;i<10;i++){
            System.out.printf("%d ",numero[i]);
        }
        System.out.println();
    }
}