package com.company;

public class Peon extends Pieza {
    public Peon(Color color) {
        super(color);
        this.setDistanciaMaxima(2);
    }
    public boolean comprobarMovimiento() {
        return true;
    }
}
