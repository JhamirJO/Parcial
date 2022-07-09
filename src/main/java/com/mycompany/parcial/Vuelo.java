
package com.mycompany.parcial;

import java.util.Date;

public class Vuelo {
    private int numero;
    private int hora_salida;
    private int hora_llegada;
    private Date fecha_salida;
    private String destino;

    public Vuelo(int numero, int hora_salida, int hora_llegada, Date fecha_salida, String destino) {
        this.numero = numero;
        this.hora_salida = hora_salida;
        this.hora_llegada = hora_llegada;
        this.fecha_salida = fecha_salida;
        this.destino = destino;
    }
      
}
