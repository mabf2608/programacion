public class Ejercicio16 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("AVERIGUA LA PROBABILIDAD DE QUE TU PAREJA TE SEA INFIEL RESPONDIENDO LAS VERDADEROGUIENTES PREGUNTAS: ");
        System.out.println();
        System.out.println("Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
        System.out.println("1) VERDADERO.");
        System.out.println("2) FALSO");
        System.out.println();
        int cont = 0;
        int a = Integer.parseInt(System.console().readLine());
        switch(a) {
            case 1:
            cont = cont + 3;
            break;
            case 2:
            break;
            default:
            System.out.println("Opción no válida.");
        }
        System.out.println();
        System.out.println("Ha aumentado sus gastos de vestuario.");
        System.out.println("1) VERDADERO.");
        System.out.println("2) FALSO");
        System.out.println();
        int b = Integer.parseInt(System.console().readLine());
        switch(b) {
            case 1:
            cont = cont + 3;
            break;
            case 2:
            break;
            default:
            System.out.println("Opción no válida.");
        }
        System.out.println();
        System.out.println("Ha perdido el interés que mostraba anteriormente por ti.");
        System.out.println("1) VERDADERO.");
        System.out.println("2) FALSO");
        System.out.println();
        int c = Integer.parseInt(System.console().readLine());
        switch(c) {
            case 1:
            cont = cont + 3;
            break;
            case 2:
            break;
            default:
            System.out.println("Opción no válida.");
        }
        System.out.println();
        System.out.println("Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer).");
        System.out.println("1) VERDADERO.");
        System.out.println("2) FALSO");
        System.out.println();
        int d = Integer.parseInt(System.console().readLine());
        switch(d) {
            case 1:
            cont = cont + 3;
            break;
            case 2:
            break;
            default:
            System.out.println("Opción no válida.");
        }
        System.out.println();
        System.out.println("No te deja que mires la agenda de su teléfono móvil.");
        System.out.println("1) VERDADERO.");
        System.out.println("2) FALSO");
        System.out.println();
        int e = Integer.parseInt(System.console().readLine());
        switch(e) {
            case 1:
            cont = cont + 3;
            break;
            case 2:
            break;
            default:
            System.out.println("Opción no válida.");
        }
        System.out.println();
        System.out.println("A veces tiene llamadas que dice no querer contestar cuando estás tú delante.");
        System.out.println("1) VERDADERO.");
        System.out.println("2) FALSO");
        System.out.println();
        int f = Integer.parseInt(System.console().readLine());
        switch(f) {
            case 1:
            cont = cont + 3;
            break;
            case 2:
            break;
            default:
            System.out.println("Opción no válida.");
        }
        System.out.println();
        System.out.println("Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.");
        System.out.println("1) VERDADERO.");
        System.out.println("2) FALSO");
        System.out.println();
        int g = Integer.parseInt(System.console().readLine());
        switch(g) {
            case 1:
            cont = cont + 3;
            break;
            case 2:
            break;
            default:
            System.out.println("Opción no válida.");
        }
        System.out.println();
        System.out.println("Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.");
        System.out.println("1) VERDADERO.");
        System.out.println("2) FALSO");
        System.out.println();
        int h = Integer.parseInt(System.console().readLine());
        switch(h) {
            case 1:
            cont = cont + 3;
            break;
            case 2:
            break;
            default:
            System.out.println("Opción no válida.");
        }
        System.out.println();
        System.out.println("Has notado que últimamente se perfuma más.");
        System.out.println("1) VERDADERO.");
        System.out.println("2) FALSO");
        System.out.println();
        int i = Integer.parseInt(System.console().readLine());
        switch(i) {
            case 1:
            cont = cont + 3;
            break;
            case 2:
            break;
            default:
            System.out.println("Opción no válida.");
        }
        System.out.println();
        System.out.println("Se confunde y te dice que ha estado en sitios donde no ha ido contigo.");
        System.out.println("1) VERDADERO.");
        System.out.println("2) FALSO");
        System.out.println();
        int j = Integer.parseInt(System.console().readLine());
        switch(j) {
            case 1:
            cont = cont + 3;
            break;
            case 2:
            break;
            default:
            System.out.println("Opción no válida.");
        }
        if (cont >=0 && cont <=10){
            System.out.println();
            System.out.println("¡Enhorabuena! Parece ser que tu pareja te es fiel.");
        }else{
            if (cont > 10 && cont <= 22){
                System.out.println();
                System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
            }else{
                if (cont > 22 && cont <= 30){
                    System.out.println();
                    System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
                }else{
                    System.out.println();
                    System.out.println("Algo has hecho muy mal para que te salga este mensaje.");
                }
            }
        }
    }
}
