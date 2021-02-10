package com.company;


import com.company.movements.IDiagonalMovement;
import com.company.movements.IHorizontalMovement;
import com.company.movements.IVerticalMovement;

public class Rey extends Pieza implements IHorizontalMovement, IVerticalMovement, IDiagonalMovement {
    public Rey(Color color) {
        super(color);
        this.setDistanciaMaxima(1);
    }

    public boolean comprobarMovimiento(Tablero tablero, int intColumnaInicio, int filaInicio, int intColumnaFinal, int filaFinal) {
        return comprobarHorizontal(tablero, intColumnaInicio, filaInicio, intColumnaFinal, filaFinal);
    }
}
