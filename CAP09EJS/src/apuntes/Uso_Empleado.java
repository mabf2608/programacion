package apuntes;

public class Uso_Empleado {
    public static void main(String[] args) {
        Empleado[] misEmpleados=new Empleado[3];
        misEmpleados[0]=new Empleado("Migue", 2000, 2030, 8, 31);
        misEmpleados[1]=new Empleado("Irene", 4500, 2025, 6, 2);
        misEmpleados[2]=new Empleado("David", 7000, 2024, 5, 18);

        for(Empleado e: misEmpleados){
            e.setSubeSueldo(5);

            System.out.println("Nombre: "+e.getNombre()+ " Sueldo: "+e.getSueldo()+" Fecha de alta: "+e.getFechaContrato());
        }

        /*for(int i=0;i<3;i++){

            System.out.println("Nombre: "+misEmpleados[i].getNombre()+ " Sueldo: "+misEmpleados[i].getSueldo()+" Fecha de alta: "+misEmpleados[i].getFechaContrato());
        }
        Empleado empleado1=new Empleado("Migue", 2000, 2030, 8, 31);
        Empleado empleado2=new Empleado("Irene", 4500, 2025, 6, 2);
        Empleado empleado3=new Empleado("David", 7000, 2024, 5, 18);
        
        empleado1.setSubeSueldo(10);
        empleado2.setSubeSueldo(15);
        empleado3.setSubeSueldo(20);

        System.out.println("Nombre: "+empleado1.getNombre()+ " Sueldo: "+empleado1.getSueldo()+" Fecha de alta: "+empleado1.getFechaContrato());

        System.out.println("Nombre: "+empleado2.getNombre()+ " Sueldo: "+empleado2.getSueldo()+" Fecha de alta: "+empleado2.getFechaContrato());

        System.out.println("Nombre: "+empleado3.getNombre()+ " Sueldo: "+empleado3.getSueldo()+" Fecha de alta: "+empleado3.getFechaContrato());*/
    }
}
