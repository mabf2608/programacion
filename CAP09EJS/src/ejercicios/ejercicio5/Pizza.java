/*
*Ejercicio 5 | Tema 9
*Implementa la clase Pizza con los datos indicados.
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/

package ejercicios.ejercicio5;

public class Pizza {
    private String tamaño;
    private String tipo;
    private String estado;
    private static int pizzasPedidas=0;
    private static int pizzasServidas=0;
    
    public Pizza (String tamaño, String tipo){
        this.tamaño=tamaño;
        this.tipo=tipo;
        estado="Pedida";
        pizzasPedidas++;
    }

    public void setTipo(String tipo){
        this.tipo=tipo;
    }

    public void setTamaño(String tamaño){
        this.tamaño=tamaño;
    }

    public String getTipo(){
        return tipo;
    }

    public String getTamaño(){
        return tamaño;
    }

    public String getEstado(){
        return estado;
    }

    public static int getTotalPedidas(){
        return pizzasPedidas;
    }

    public static int getTotalServidas(){
        return pizzasServidas;
    }

    public void servirPizza(){
        if (estado.toLowerCase().equals("pedida")){
            pizzasServidas+=1;
            estado="Servida";
        }else{
            System.out.println("Esa pizza ya se ha servido.");
        }
    }

    @Override
    public String toString() {
        return String.format("La pizza es una %s de tamaño %s, se encuentra %s", tipo, tamaño, estado);
    }
}
