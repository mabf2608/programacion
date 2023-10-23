public class Ejercicio18 {
    public static void mult(int v1,int v2){
        int multiplos = 7;
        for (int i=v1;i<=v2;i=i+multiplos)
            System.out.println(i);
    }
    public static void main(String[] args) {
        System.out.println();
        System.out.print("Introduce el primer número entero: ");
        int n1 = Integer.parseInt(System.console().readLine());
        System.out.println();
        System.out.print("Introduce el segundo número entero: ");
        int n2 = Integer.parseInt(System.console().readLine());
        System.out.println();
        if (n1<n2){
            mult(n1,n2);
        }else{
            if(n2>n1)
            mult(n2,n1);
            else
            System.out.println("Los números no pueden ser iguales.");
        }
    }
}