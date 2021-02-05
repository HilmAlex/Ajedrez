package com.company;

public class Alfil extends Pieza {
    public Alfil(Color color) {
        super(color);
        this.setDistanciaMaxima(7);
    }
    public boolean comprobarMovimiento() {
        return true;
    }

}
