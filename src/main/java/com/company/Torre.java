package com.company;

public class Torre extends Pieza {
    public Torre(Color color) {
        super(color);
        this.setDistanciaMaxima(7);
    }
    public boolean comprobarMovimiento() {
        return true;
    }
}
