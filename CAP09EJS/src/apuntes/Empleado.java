package apuntes;
import java.util.*;

public class Empleado {
    public Empleado(String nom, double sue, int agno, int mes, int dia){
        nombre=nom;

        sueldo=sue;

        GregorianCalendar calendario=new GregorianCalendar(agno, mes-1,dia);

        altaContrato=calendario.getTime();
    }

    //GETTER
    public String getNombre(){

        return nombre;
    }
    
    public double getSueldo(){

        return sueldo;
    }

    public Date getFechaContrato(){

        return altaContrato;
    }

    //SETTER

    public void setSubeSueldo(double porcentaje){

        double aumento=sueldo*(porcentaje/100);
        sueldo+=aumento;
    }

    private String nombre;

    private double sueldo;

    private Date altaContrato;
}
