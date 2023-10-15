public class Ejercicio15 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("INTRODUCE UN SÍMBOLO, NÚMERO O LETRA PARA REALIZAR LA PIRÁMIDE.");
        String car = System.console().readLine();
        System.out.println();
        System.out.println("SELECCIONA HACIA DONDE SEÑALARÁ EL VÉRTICE DE LA PIRÁMIDE.");
        System.out.println("1.- Arriba.");
        System.out.println("2.- Abajo.");
        System.out.println("3.- Izquierda.");
        System.out.println("4.- Derecha.");
        int n = Integer.parseInt(System.console().readLine());
        System.out.println();
        switch(n){
            case 1:
            System.out.println("Has elegido hacia arriba.");
            System.out.println();
            System.out.printf("%9s%n",""+car);
            System.out.printf("%10s%n",""+car+car+car);
            System.out.printf("%11s%n",""+car+car+car+car+car);
            System.out.printf("%12s%n",""+car+car+car+car+car+car+car);
            System.out.printf("%13s%n",""+car+car+car+car+car+car+car+car+car);
            break;

            case 2:
            System.out.println("Has elegido hacia abajo.");
            System.out.println();
            System.out.printf("%13s%n",""+car+car+car+car+car+car+car+car+car);
            System.out.printf("%12s%n",""+car+car+car+car+car+car+car);
            System.out.printf("%11s%n",""+car+car+car+car+car);
            System.out.printf("%10s%n",""+car+car+car);
            System.out.printf("%9s%n",""+car);
            break;

            case 3:
            System.out.println("Has elegido hacia la izquierda.");
            System.out.println();
            System.out.printf("%5s%n",""+car);
            System.out.printf("%6s%n",""+car+car);
            System.out.printf("%7s%n",""+car+car+car);
            System.out.printf("%8s%n",""+car+car+car+car);
            System.out.printf("%9s%n",""+car+car+car+car+car);
            System.out.printf("%8s%n",""+car+car+car+car);
            System.out.printf("%7s%n",""+car+car+car);
            System.out.printf("%6s%n",""+car+car);
            System.out.printf("%5s%n",""+car);
            break;

            case 4:
            System.out.println("Has elegido hacia la izquierda.");
            System.out.println();
            System.out.printf("%9s%n",""+car);
            System.out.printf("%9s%n",""+car+car);
            System.out.printf("%9s%n",""+car+car+car);
            System.out.printf("%9s%n",""+car+car+car+car);
            System.out.printf("%9s%n",""+car+car+car+car+car);
            System.out.printf("%9s%n",""+car+car+car+car);
            System.out.printf("%9s%n",""+car+car+car);
            System.out.printf("%9s%n",""+car+car);
            System.out.printf("%9s%n",""+car);
            break;

            default:
            System.out.println("Opción no válida.");
        }
    }
}
