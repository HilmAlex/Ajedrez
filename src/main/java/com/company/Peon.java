package com.company;

public class Peon extends Pieza {
    public Peon(Color color) {
        super(color);
        this.setDistanciaMaxima(2);
    }

    @Override
    public boolean comprobarMovimiento(Tablero tablero, int intColumnaInicio, int filaInicio, int intColumnaFinal,
                                       int filaFinal) {
        return false;
    }

    public boolean comprobarMovimiento() {
        return true;
    }
}
