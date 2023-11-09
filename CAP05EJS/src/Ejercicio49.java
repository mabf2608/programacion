/*
*Ejercicio 49 | Tema 5
*Números positivos sin contar primos
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio49 {
    public static boolean esPrimo(int v1){
        boolean primo = true;
        for(int i=2; i<=v1/2;i++){
            if(v1%i==0)
                return primo=false;
        }
        return primo;
    }
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Por favor vaya introduciendo números enteros positivos. Para terminar, introduzca un número primo: ");
        boolean primo = false;
        int n=0, max=0, min=0, k=0;
        float media=0,suma=0;
        while(!primo){
            n=Integer.parseInt(System.console().readLine());
            primo=esPrimo(n);
            if (!primo){
                k++;
                if (n>max)
                    max=n;
                if (k==1)
                    min=n;
                else
                    if (n<min)
                        min=n;
                suma=(suma+n);
                media=suma/k;
            }
        }
        System.out.println();
        System.out.printf("Ha introducido %d números no primos.%n",k);
        System.out.printf("Máximo: %d%n",max);
        System.out.printf("Mínimo: %d%n",min);
        System.out.printf("Media: %.2f",media);
    }
}
