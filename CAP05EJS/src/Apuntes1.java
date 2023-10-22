public class Apuntes1 {
    public static int suma(int v1, int v2){
        return v1+v2;
    }
    public static void main(String[] args) throws Exception { /*Protected, public o private */ /*Con void no hago nada */
        int a = 3;
        int b = 1;
        int c = suma(a, suma(a, suma(a,b)));
        System.out.println(c);
    }
}
