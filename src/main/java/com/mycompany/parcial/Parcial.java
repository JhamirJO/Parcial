
package com.mycompany.parcial;


public class Parcial {

    public static void main(String[] args) {
        Cliente cliente_1 = new Cliente(100, 10, "12345678", "Jhamir");
        Empleado empleado_1 = new Empleado(3500, 101, "23456789", "Diego");
        Asiento asiento_1 = new Asiento(1, 200);
        Venta venta_1 = new Venta();
        System.out.println("Agregando cliente a la venta...");
        System.out.println(venta_1.setCliente(cliente_1));
        System.out.println("Agregando empleado a la venta...");
        System.out.println(venta_1.setEmpleado(empleado_1));
        System.out.println("Agregando asiento a la venta...");
        System.out.println(venta_1.agregarAsiento(asiento_1));
        System.out.println("\nAgregado exitosamente");
    }
}
