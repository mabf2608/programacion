package ejercicios.ejercicio7;

public class expoCochesCampanillas {
    public static void menu(){
        System.out.println("\n1.- Mostrar número de entradas libres Sala Principal.");
        System.out.println("2.- Mostrar número de entradas libres Sala VIP.");
        System.out.println("3.- Mostrar número de entradas libres Sala Compra-Venta.");
        System.out.println("4.- Vender entradas Sala Principal.");
        System.out.println("5.- Vender entradas Sala VIP");
        System.out.println("6.- Vender entradas Sala Compra-Venta");
        System.out.println("7.- Salir");
        System.out.println();
    }
    public static void main(String[] args) {
        Zona salaPrincipal = new Zona(1000);
        Zona compraVenta = new Zona(200);
        Zona VIP = new Zona(25);

        int opcion;
        boolean salir=false;

        do{
            menu();
            System.out.println("Introduce una opción del menú: ");
            opcion=Integer.parseInt(System.console().readLine());
            System.out.println();
            int entradas;
            switch (opcion) {
                case 1:
                    System.out.printf("Quedan un total de %d entradas para la sala Principal.%n", salaPrincipal.getEntradasPorVender());
                    break;
                case 2:
                    System.out.printf("Quedan un total de %d entradas para la sala Compra-Venta.%n", compraVenta.getEntradasPorVender());
                    break;
                case 3:
                    System.out.printf("Quedan un total de %d entradas para la sala VIP.%n", VIP.getEntradasPorVender());
                    break;
                case 4:
                    System.out.println("Introduce la cantidad de entradas que quieres comprar: ");
                    entradas=Integer.parseInt(System.console().readLine());
                    System.out.println();
                    salaPrincipal.vender(entradas);
                    break;
                case 5:
                    System.out.println("Introduce la cantidad de entradas que quieres comprar: ");
                    entradas=Integer.parseInt(System.console().readLine());
                    System.out.println();
                    compraVenta.vender(entradas);
                    break;
                case 6:
                    System.out.println("Introduce la cantidad de entradas que quieres comprar: ");
                    entradas=Integer.parseInt(System.console().readLine());
                    System.out.println();
                    VIP.vender(entradas);
                    break;
                case 7:
                    System.out.println("Gracias por comprar con nosotros.");
                    salir=true;
                default:
                    System.out.println("ERROR: Introduce un valor válido.");
                    break;
            }
            System.out.println();
            System.out.println("Pulsa ENTER para continuar.");
            System.console().readLine();
        }while(!salir);
    }
}
