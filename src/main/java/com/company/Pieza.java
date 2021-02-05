package com.company;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public abstract class Pieza {
    private int distanciaMaxima;
    private Color color;

    public Pieza(Color color) {
        this.color = color;
    }


    public Color getColor() {
        return color;
    }

    public void setDistanciaMaxima(int distanciaMaxima) {
        this.distanciaMaxima = distanciaMaxima;
    }

    public abstract boolean comprobarMovimiento();

    @Override
    public String toString() {
        return " " + getClass().getName().substring(12) + " " + color.toString().charAt(0);
    }
}
