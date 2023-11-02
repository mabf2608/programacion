//Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
//entre 1 y un número leído por teclado

public class Ejercicio27 {
    public static void mult(int v1){
        int j=0;
        int k=0;
        System.out.println();
        System.out.print("Los números múltiplos de 3 son: ");
        for (int i = 1 ; i <= v1 ; i++ ){
            if (i%3==0){
                System.out.print(i+" ");
                j=j+i;
                k++;
            }
        }
        System.out.println();
        System.out.printf("Hay un total de %d múltiplos entre ambos números.%n",k);
        System.out.printf("La suma de todos esos números es %d.%n",j);
    }
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Introduce un número para indicar los múltiplos de 3: ");
        int n = Integer.parseInt(System.console().readLine());
        mult(n);
    }
}
