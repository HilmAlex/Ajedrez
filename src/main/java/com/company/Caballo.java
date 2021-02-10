package com.company;

public class Caballo extends Pieza{
    public Caballo(Color color) {
        super(color);
        this.setDistanciaMaxima(3);
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
