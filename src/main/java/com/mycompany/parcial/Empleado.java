
package com.mycompany.parcial;

public class Empleado extends Persona{
    private float sueldo;
    private int codigo;
    
    public Empleado(float sueldo, int codigo, String dni, String nombre) {
        super(dni, nombre);
        this.sueldo = sueldo;
        this.codigo = codigo;
    }
    
}
