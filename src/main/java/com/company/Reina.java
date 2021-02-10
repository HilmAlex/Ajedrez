package com.company;

public class Reina extends Pieza {
    public Reina(Color color) {
        super(color);
        this.setDistanciaMaxima(7);
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
