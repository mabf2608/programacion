public class Ejercicio28 {
    public static void factorial(int v1){
        System.out.println();
        int j = 1;
        for (int i=2 ; i<=v1 ; i++){
            j=j*i;
        }
        System.out.printf("%d! = %d",v1,j);
    }
    public static void main(String[] args) {
        try{
        System.out.println();
        System.out.println("Introduce un número entero para saber su factorial: ");
        int n = Integer.parseInt(System.console().readLine());
        factorial(n);
        }catch (Exception e){
            System.out.println("ERROR: El número introducido debe ser un entero, vuelva a intentarlo.");
        }
    }
}
