
package com.mycompany.parcial;

public class Asiento {
    private int numero;
    private boolean estado;
    private float precio;
    
    enum estadoAsiento{
        LIBRE, VENDIDO, INHABILITADO;
    }

    public Asiento(int numero, float precio) {
        this.numero = numero;
        this.precio = precio;
        this.estado = Boolean.FALSE;
    }
    public boolean isEstado() {
        return this.estado;
    }
    
    public boolean reservar(){
        this.estado = Boolean.TRUE;
        return this.estado;
    }
    
    public boolean cancelar(){
        this.estado = Boolean.FALSE;
        return this.estado;
    }
}
