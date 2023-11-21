/*
*Ejercicio 27 | Tema 6
*Piedra, papel o tijeras.
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/
public class Ejercicio27 {
    public static String tiroordenador(int eleccionordenador){
        switch (eleccionordenador) {
            case 0:
                return "piedra";
            case 1:
                return "papel";
            case 2:
                return "tijeras";
            default:
                return "";
        }
    }
    public static void main(String[] args) {
        boolean seguir=true;
        String eleccionjugador="";
        while (seguir) {
            System.out.println();
            System.out.print("Turno del jugador: Introduzca piedra, papel o tijeras: ");
            eleccionjugador=(System.console().readLine()).toUpperCase();
            if(eleccionjugador.equals("PIEDRA")||eleccionjugador.equals("PAPEL")||eleccionjugador.equals("TIJERAS")){
                seguir=false;
            }else{
                System.out.println("ERROR: Introduce un valor correcto.");
            }
        }
        String eleccionordenador=tiroordenador((int)(Math.random()*3));
        System.out.printf("Turno del ordenador: %s.%n",eleccionordenador);
        if (eleccionjugador.equals(eleccionordenador.toUpperCase())){
            System.out.println("Empate.");
        }
        if(eleccionjugador.equals("TIJERAS")&&eleccionordenador.equals("papel")||eleccionjugador.equals("PIEDRA")&&eleccionordenador.equals("tijeras")||eleccionjugador.equals("PAPEL")&&eleccionordenador.equals("piedra")){
            System.out.println("Gana el jugador.");
        }
        if(eleccionordenador.equals("tijeras")&&eleccionjugador.equals("PAPEL")||eleccionordenador.equals("piedra")&&eleccionjugador.equals("TIJERAS")||eleccionordenador.equals("papel")&&eleccionjugador.equals("PIEDRA")){
            System.out.println("Gana el ordenador.");
        }
    }
}