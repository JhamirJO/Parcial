
package com.mycompany.parcial;

public class Asiento {
    private int numero;
    private boolean estado;
    private float precio;

    public Asiento(int numero, boolean estado, float precio) {
        this.numero = numero;
        this.precio = precio;
    }
    
    public boolean reservar(){
        boolean result = false;
        return result;
    }
    
    public boolean cancelar(){
        boolean result = false;
        return result;
    }
}
