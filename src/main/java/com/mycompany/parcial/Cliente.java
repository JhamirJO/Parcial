
package com.mycompany.parcial;

public class Cliente extends Persona{
    private float dinero;
    private int puntos;

    public Cliente(float dinero, int puntos, String dni, String nombre) {
        super(dni,nombre);
        this.dinero = dinero;
        this.puntos = puntos;
    } 
}
