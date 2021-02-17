package com.company;

import com.company.movements.IDiagonalMovement;
import com.company.movements.IVerticalMovement;

public class Peon extends Pieza implements IVerticalMovement, IDiagonalMovement {

    private boolean orientacionArriba;

    public Peon(Color color) {
        super(color);
        this.setDistanciaMaxima(2);
        this.orientacionArriba = this.getColor() == Color.BLANCO;
    }

    @Override
    public boolean comprobarMovimiento(Tablero tablero, int intColumnaInicio, int filaInicio, int intColumnaFinal,
                                       int filaFinal) {

        //TODO: Mover hacia arriba o abajo según el color
        if (!(filaFinal - filaInicio > 0 == orientacionArriba)) return false;

        //TODO: Distancia máxima al principio de la partida y durante la partida
        if (!(Math.abs(filaFinal - filaInicio) <= getDistanciaMaxima() && (Math.abs(intColumnaInicio - intColumnaFinal) <= 1)))
            return false;

        //TODO: Comprobar movimiento
        if (intColumnaInicio == intColumnaFinal)
            comprobarVertical(tablero, intColumnaInicio, filaInicio, intColumnaFinal, filaFinal);

        else {
            if (tablero.getCasillas(intColumnaFinal, filaFinal).getPieza() == null) return false;
            comprobarDiagonal(tablero, intColumnaInicio, filaInicio, intColumnaFinal, filaFinal);
        }
        {

        }


        this.setDistanciaMaxima(1);

        return true;
    }
}

