
package com.mycompany.parcial;

import java.util.Date;

public class Venta {
    private Date fecha;
    private float montoTotal;
    private int numAsientos;
    private Empleado empleado;
    private Cliente cliente;
    private Asiento asiento;
    
    public boolean agregarAsiento(Asiento asiento){
        boolean result = false;
        return result;
    }
    public boolean setEmpleado(Empleado empleado){
        boolean result = false;
        if("Diego".equalsIgnoreCase(empleado.getNombre())){
            this.empleado = empleado;
            result = true;
        }
        return result;
    }
    public boolean setCliente(Cliente cliente){
        boolean result = false;
        if("Jhamir".equalsIgnoreCase(cliente.getNombre())){
            this.cliente = cliente;
            result = true;
        }
        return result;
    }
}
