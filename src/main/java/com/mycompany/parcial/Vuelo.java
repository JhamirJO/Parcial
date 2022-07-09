
package com.mycompany.parcial;

import java.util.Date;

public class Vuelo {
    private int numero;
    private int horaSalida;
    private int horaLlegada;
    private Date fechaSalida;
    private String destino;
    private Asiento asiento[] = new Asiento[10];

    public Vuelo(int numero, int horaSalida, int horaLlegada, Date fechaSalida, String destino) {
        this.numero = numero;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.fechaSalida = fechaSalida;
        this.destino = destino;
    }
    public Asiento[] reporteDeAsientosVendidosOrdenadosNro(){
        Asiento[] asientos = new Asiento[10];
        return asientos;
    }
    public Asiento[] reporteDeAsientosVendidosOrdenadosNombre(){
        Asiento[] asientos = new Asiento[10];
        return asientos;
    }
    public Asiento buscarAsiento(int asiento){
        Asiento result = null;
        return result;
    }      
}
