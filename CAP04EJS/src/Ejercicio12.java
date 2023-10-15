public class Ejercicio12 {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Responde a las siguientes cuestiones: ");
        int cont = 0;
        System.out.println();
        System.out.println("Primera pregunta: ¿Qué es el software?");
        System.out.println("1) Programas ejecutados en un sistema de computación.");
        System.out.println("2) Todo lo físico que compone un ordenador, como la placa base, la torre...");
        System.out.println();
        int a = Integer.parseInt(System.console().readLine());
        switch(a) {
            case 1:
            System.out.println("Correcto, siguiente pregunta");
            cont++;
            break;
            case 2:
            System.out.println("Has fallado, siguiente pregunta...");
            break;
            default:
            System.out.println("Opción no válida.");
        }
        System.out.println();
        System.out.println("Segunda pregunta: ¿Cuál es la respuesta correcta?");
        System.out.println("1) Un programa está compuesto de algoritmos.");
        System.out.println("2) Un algoritmo está compuesto de programas.");
        System.out.println();
        int b = Integer.parseInt(System.console().readLine());
        switch(b) {
            case 1:
            System.out.println("Correcto, siguiente pregunta");
            cont++;
            break;
            case 2:
            System.out.println("Has fallado, siguiente pregunta...");
            break;
            default:
            System.out.println("Opción no válida.");
        }
        System.out.println();
        System.out.println("Tercera pregunta: ¿Cuál es el lenguaje de programación más usado?");
        System.out.println("1) Java.");
        System.out.println("2) C++.");
        System.out.println("3) Python.");
        System.out.println("4) Ruby.");
        System.out.println();
        int c = Integer.parseInt(System.console().readLine());
        switch(c) {
            case 1:
            System.out.println("Has fallado, siguiente pregunta...");
            break;
            case 2:
            System.out.println("Has fallado, siguiente pregunta...");
            break;
            case 3:
            System.out.println("Correcto, siguiente pregunta.");
            cont++;
            break;
            case 4:
            System.out.println("Has fallado, siguiente pregunta...");
            break;
            default:
            System.out.println("Opción no válida.");
        }
        System.out.println();
        System.out.println("Cuarta pregunta: ¿Cuál es una parte del hardware?");
        System.out.println("1) Base de datos.");
        System.out.println("2) Microsoft Visual Studio Code.");
        System.out.println("3) Sistema Operativo.");
        System.out.println("4) Placa Base.");
        System.out.println();
        int d = Integer.parseInt(System.console().readLine());
        switch(d) {
            case 1:
            System.out.println("Has fallado, siguiente pregunta...");
            break;
            case 2:
            System.out.println("Has fallado, siguiente pregunta...");
            break;
            case 3:
            System.out.println("Has fallado, siguiente pregunta...");
            break;
            case 4:
            System.out.println("Correcto, siguiente pregunta.");
            cont++;
            break;
            default:
            System.out.println("Opción no válida.");
        }
        System.out.println();
        System.out.println("Quinta pregunta: Visual Studio Code es un entorno de desarrollo creado por Sony.");
        System.out.println("1) Verdadero.");
        System.out.println("2) Falso.");
        System.out.println();
        int e = Integer.parseInt(System.console().readLine());
        switch(e) {
            case 1:
            System.out.println("Has fallado, siguiente pregunta...");
            break;
            case 2:
            System.out.println("Correcto, siguiente pregunta");
            cont++;
            break;
            default:
            System.out.println("Opción no válida.");
        }
        System.out.println();
        System.out.println("Sexta pregunta: Linux es un S.O. de código abierto.");
        System.out.println("1) Verdadero.");
        System.out.println("2) Falso.");
        System.out.println();
        int f = Integer.parseInt(System.console().readLine());
        switch(f) {
            case 1:
            System.out.println("Correcto, siguiente pregunta");
            cont++;
            break;
            case 2:
            System.out.println("Has fallado, siguiente pregunta...");
            break;
            default:
            System.out.println("Opción no válida.");
        }
        System.out.println();
        System.out.println("Séptima pregunta: HTML es un lenguaje de programación.");
        System.out.println("1) Verdadero, es un lenguaje de programación.");
        System.out.println("2) Falso, es un lenguaje de marcas.");
        System.out.println();
        int g = Integer.parseInt(System.console().readLine());
        switch(g) {
            case 1:
            System.out.println("Has fallado, siguiente pregunta...");
            break;
            case 2:
            System.out.println("Correcto, siguiente pregunta");
            cont++;
            break;
            default:
            System.out.println("Opción no válida.");
        }
        System.out.println();
        System.out.println("Octava pregunta: Si cambias de placa base y tiene un socket diferente, debes cambiar de procesador.");
        System.out.println("1) Verdadero.");
        System.out.println("2) Falso.");
        System.out.println();
        int h = Integer.parseInt(System.console().readLine());
        switch(h) {
            case 1:
            System.out.println("Correcto, siguiente pregunta");
            cont++;
            break;
            case 2:
            System.out.println("Has fallado, siguiente pregunta...");
            break;
            default:
            System.out.println("Opción no válida.");
        }
        System.out.println();
        System.out.println("Novena pregunta: ¿Te está resultando fácil el grado?.");
        System.out.println("1) Verdadero.");
        System.out.println("2) Falso.");
        System.out.println();
        int i = Integer.parseInt(System.console().readLine());
        switch(i) {
            case 1:
            System.out.println("Correcto, siguiente pregunta");
            cont++;
            break;
            case 2:
            System.out.println("Has fallado, siguiente pregunta...");
            break;
            default:
            System.out.println("Opción no válida.");
        }
        System.out.println();
        System.out.println("Decima pregunta: ¿Has estudiado para el examen?.");
        System.out.println("1) Si.");
        System.out.println("2) No.");
        System.out.println();
        int j = Integer.parseInt(System.console().readLine());
        switch(j) {
            case 1:
            System.out.println("Correcto, siguiente pregunta");
            cont++;
            break;
            case 2:
            System.out.println("Has fallado, siguiente pregunta...");
            break;
            default:
            System.out.println("Opción no válida.");
        }
        System.out.println();
        if (cont >= 0 && cont < 5){
            System.out.println("Has suspendido el test con una nota de "+cont+" sobre 10, ¡más suerte la próxima vez!");
        }else{
            if (cont >= 5 && cont <= 10){
                System.out.println("Has aprobado el test con una nota de "+cont+" sobre 10, felicidades");
            }else{
                System.out.println("Si te sale este mensaje has tenido que hacer algo muy mal...");
            }
        }
    }
    
}