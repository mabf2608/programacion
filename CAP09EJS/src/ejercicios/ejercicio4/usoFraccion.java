package ejercicios.ejercicio4;

public class usoFraccion {
    public static void main(String[] args) {
        Fraccion fr1 = new Fraccion(20, 10);
        fr1.setDenominador(50);
        fr1.setNumerador(30);
        fr1.simplificar();
        System.out.println(fr1.dividir());
        System.out.println(fr1.multiplicar());
        System.out.println(fr1);
    }
}
