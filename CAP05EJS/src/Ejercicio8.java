public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Introduce un número para saber su tabla de multiplicar: ");
        int n = Integer.parseInt(System.console().readLine());
        for(int i = 0; i <= 10; i++){
            System.out.printf("[%d * %d] = [%d]%n",n,i,n*i);
        }
    }
}
