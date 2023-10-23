public class Ejercicio15 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Introduce una base: ");
        int b = Integer.parseInt(System.console().readLine());
        System.out.println("Introduce un exponente: ");
        int e = Integer.parseInt(System.console().readLine());
        int n = 0;
        System.out.println();
        if (e >=0){
        for (int i = 1; i <= e; i++){
            n = n+1; 
            System.out.printf("%d^%d ",b,n);
        }
    }else{
        System.out.println("ERROR: El exponente tiene que ser positivo.");
    }
   }
}
