package com.company;

public class Rey extends Pieza {
    public Rey(Color color) {
        super(color);
        this.setDistanciaMaxima(1);
    }

    public boolean comprobarMovimiento() {
        return true;
    }
}
