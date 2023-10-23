public class Ejercicio9 {
    public static void main(String[] args) {
        try{
        System.out.println();
        System.out.print("Introduce un número y te diré cuántas dígitos tiene: ");
        long n = Long.parseLong(System.console().readLine());
        int i = 0;
        while (n > 0 || n < 0){
            n = n / 10;
            i = i + 1;
        }
        System.out.println("Tu número tiene "+i+" dígitos.");
        }catch(Exception e){
            System.out.println("ERROR: Número no permitido (demasiado largo)");
        }
    }
}
