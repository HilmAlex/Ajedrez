package com.company;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public abstract class Pieza {
    private int distanciaMaxima;
    private Color color;
    private int cantidadDeMovimientos;


    public Pieza(Color color) {
        this.color = color;
        this.distanciaMaxima = 7;
        this.cantidadDeMovimientos = 0;
    }


    public Color getColor() {
        return color;
    }

    public void setDistanciaMaxima(int distanciaMaxima) {
        this.distanciaMaxima = distanciaMaxima;
    }

    public abstract boolean comprobarMovimiento(Tablero tablero, int intColumnaInicio, int filaInicio, int intColumnaFinal, int filaFinal);

    public int getDistanciaMaxima() {
        return distanciaMaxima;
    }

    @Override
    public String toString() {
        return " " + getClass().getName().substring(12) + " " + color.toString().charAt(0);
    }
}
