public class Ejercicio7 {
   public static void main(String[] args) {
        System.out.println("Este programa resuelve ecuaciones de segundo grado.");
        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Por favor, introduzca los valores.");
        System.out.print("a = ");
        Double a = Double.parseDouble(System.console().readLine());
        System.out.print("b = ");
        Double b = Double.parseDouble(System.console().readLine());
        System.out.print("c = ");

        Double c = Double.parseDouble(System.console().readLine());
        if(a==0){
            Double x = -c/b;
            System.out.printf("La solución a la ecuacion es x = %.8f%n", x);
        }
        else{
            Double raiz = b*b-4*a*c;
            if(raiz<0){
                System.out.println("La ecuación no tiene solución real");
            }
            else{
                Double x1 = (-b+Math.sqrt(raiz))/2*a;
                Double x2 = (-b-Math.sqrt(raiz))/2*a;
                System.out.printf("x1 = %.8f%n", x1);
                System.out.printf("x2 = %.8f%n", x2);
            }
        }
   } 
}
