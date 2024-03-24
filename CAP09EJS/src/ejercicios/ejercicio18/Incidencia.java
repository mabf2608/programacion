package ejercicios.ejercicio18;

public class Incidencia {
    public static int id=1;
    public static int pendientes=0;
    private int identificador;
    private int puesto;
    private String problema;
    private String solucion;
    private boolean pendiente;

    public Incidencia(int puesto, String problema){
        this.puesto=puesto;
        this.problema=problema;
        identificador=id;
        id++;
        pendientes++;
        pendiente=true;
    }

    public void resuelve(String solucion){
        this.solucion=solucion;
        pendiente=false;
        pendientes--;
    }

    public static int getPendientes(){
        return pendientes;
    }

    @Override
    public String toString() {
        
        String mensaje="";

        mensaje="Incidencia "+identificador+" - Puesto: "+puesto+" - "+problema;

        if(pendiente){
            mensaje+=" - Pendiente";
        }else{
            mensaje+=" - Resuelta - "+solucion;
        }

        return mensaje;
    }

}
