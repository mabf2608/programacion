/*
*Ejercicio 21 | Tema 7
*Cincuerizar
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio21 {
    public static Integer cincuerizar(int numero){
        if(numero%5!=0){
            while(numero%5!=0){
                numero++;
            }
        }
        return numero;
    }
    public static void main(String[] args) {
        int[] numero=new int[15];
        int i;
        System.out.println();
        System.out.println("ARRAY ORIGINAL");
        for(i=0;i<15;i++){
            numero[i]=(int)(Math.random()*501);
            System.out.print(numero[i]+" ");
        }
        System.out.println();
        System.out.println();
        System.out.println("ARRAY CINCUERIZADO");
        for(i=0;i<15;i++){
            numero[i]=cincuerizar(numero[i]);
            System.out.print(numero[i]+" ");
        }
        System.out.println();
    }
}
