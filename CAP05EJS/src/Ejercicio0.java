public class Ejercicio0 {
    public static long digitos(long v1){
        long dato=0;
        while (v1>0){
            int i=(int)(v1%10);
            v1/=10;
            dato=dato*10+i;
        }
        return dato;
    }
    public static void main(String[] args) {
        long n=Long.parseLong(System.console().readLine());
        System.out.println(digitos(n));
    }
}
