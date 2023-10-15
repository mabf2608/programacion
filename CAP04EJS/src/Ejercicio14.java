public class Ejercicio14 {
    public static void main(String[] args) {
        System.out.println();
        System.out.print("Introduce un número para saber si es par y divisible entre 5: ");
        float n = Float.parseFloat(System.console().readLine());
        int par = (int)n%2;
        int mult = (int)n%5;
        System.out.println();

        if (par == 0 && mult == 0){
            System.out.printf("El número %.2f es par y divisible entre 5.",n);
        }else{
            if (par == 0 && mult != 0){
                System.out.printf("El número %.2f es par pero no es divisible ente 5.",n);
            }else{
                if (mult == 0 && par != 0){
                    System.out.printf("El número %.2f no es par pero si divisible entre 5.",n);
                }else{
                    System.out.println("El número no es par ni divisible entre 5.");
                }
            }
        }
    }
}
