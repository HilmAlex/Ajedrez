package com.company;

public class Reina extends Pieza {
    public Reina(Color color) {
        super(color);
        this.setDistanciaMaxima(7);
    }
    public boolean comprobarMovimiento() {
        return true;
    }
}
