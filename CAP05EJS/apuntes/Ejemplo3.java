import java.util.Scanner;

public class Ejemplo3 {
    /**
     * Comprueba si un número es divisor de otro
     * @param a El valor que tengo que comprobar si es divisor
     * @param b El valor que se supone es múltiplo del anterior
     * @return true si es divisor, false en caso contrario
     */
    public static boolean esDivisor(int a, int b){
        return (b % a)==0;
    }
    /**
     * Comprueba si un número es múltiplo de otro
     * @param a El valor que tengo que comprobar si es múltiplo
     * @param b El valor que se supone es divisor del anterior
     * @return true si es múltiplo, false en caso contrario
     */
    public static boolean esMultiplo(int a, int b){
        return (a % b)==0;
    }
    /**
     * Comprueba si un número es primo
     * @param a Número a comprobar
     * @return true si el valor es primo, false en caso contrario
     */
    public static boolean esPrimo(int a){
        if(a<2)
            return false;
        boolean primo = true;
        for(int i = 2; i<=a/2 && primo; i++){
            if(esDivisor(i, a))
                primo = false;
        }
        return primo;
    }
    public static void nPrimerosNumerosPrimos(int numeros){
        int i = 0;
        int contadorPrimos = 0;
        while(contadorPrimos <= numeros){
            if(esPrimo(i)){
                contadorPrimos++;
                
            }
            i++;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántos primos quieres?: ");
        int numprimos = sc.nextInt();
        nPrimerosNumerosPrimos(numprimos);
        sc.close();
    }
}
