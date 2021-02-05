package com.company;

public class Caballo extends Pieza{
    public Caballo(Color color) {
        super(color);
        this.setDistanciaMaxima(3);
    }
    public boolean comprobarMovimiento() {
        return true;
    }
}
