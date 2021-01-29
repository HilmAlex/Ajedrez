package com.company;

public class Posicion {

    private int fila;
    private String columna;

    public Posicion(int fila, String columna) {
        this.fila = fila;
        this.columna = columna.toUpperCase();
    }
}
