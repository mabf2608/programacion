public class Ejercicio17 {
    public static void main(String[] args) {
        System.out.println();
        System.out.print("Introduce un número entero y positivo: ");
        int n = Integer.parseInt(System.console().readLine());
        int i, n2;
        n2=0;
        if (n>=0){
            for(i = 1;i<=100;i++){
                n2=n2+(n+i);
            }
            System.out.println("El número "+n2+" es entero y positvo");
        }else{
            System.out.println("ERROR: El número introducido no es un entero positivo, vuelve a intentarlo...");
        }
    }
}