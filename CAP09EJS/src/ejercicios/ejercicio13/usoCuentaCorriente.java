/*
*Ejercicio 12 | Tema 9
*Cuenta corriente.
*@author Miguel Ángel Bonilla Fernández 1ºDAM
*/

package ejercicios.ejercicio13;

public class usoCuentaCorriente {
    public static void main(String[] args) {
        System.out.println();
        CuentaCorriente cuenta1 = new CuentaCorriente();
        CuentaCorriente cuenta2 = new CuentaCorriente(1500);
        CuentaCorriente cuenta3 = new CuentaCorriente(6000);

        System.out.println(cuenta1);
        System.out.println(cuenta2);
        System.out.println(cuenta3);

        cuenta1.ingreso(2000);
        cuenta2.cargo(600);
        cuenta3.ingreso(75);
        cuenta1.cargo(55);
        cuenta2.transferencia(cuenta3, 100);

        System.out.println(cuenta1);
        System.out.println(cuenta2);
        System.out.println(cuenta3);
    }
}
