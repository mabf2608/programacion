public class Ejercicio9 {
    public static void main(String[] args) {
        System.out.println();
        System.out.print("Este programa nos permite resolver una ecuación de segundo grado");
        System.out.println();

        System.out.print("Introduce el valor de a: ");
        float a = Float.parseFloat(System.console().readLine());

        System.out.print("Introduce el valor de b: ");
        float b = Float.parseFloat(System.console().readLine());

        System.out.print("Introduce el valor de c: ");
        float c = Float.parseFloat(System.console().readLine());

        float ec1 = (float)(-b + (Math.sqrt(Math.pow(b,2)-4*a*c)))/(2*a);
        float ec2 = (float)(-b - (Math.sqrt(Math.pow(b,2)-4*a*c)))/(2*a);
        System.out.println();

        if ((Float.isNaN(ec1)) && (Float.isNaN(ec2))){
            System.out.println("x = No tiene resultado.");
        }else{
        if (ec1 != ec2){
            System.out.println("Tiene dos soluciones reales: ");
            System.out.printf("x1 = %.2f%n",ec1);
            System.out.printf("x2 = %.2f%n",ec2);
        }else{
            if (ec1 == ec2){
            System.out.println("x = "+ ec1);
                }
            }
        }
    }
}