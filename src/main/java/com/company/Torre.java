package com.company;

import com.company.movements.IDiagonalMovement;
import com.company.movements.IHorizontalMovement;
import com.company.movements.IVerticalMovement;

public class Torre extends Pieza implements IHorizontalMovement, IVerticalMovement {
    public Torre(Color color) {
        super(color);
        this.setDistanciaMaxima(7);
    }


    @Override
    public boolean comprobarMovimiento(Tablero tablero, int intColumnaInicio, int filaInicio, int intColumnaFinal, int filaFinal) {

        return comprobarHorizontal(tablero, intColumnaInicio,filaInicio,intColumnaFinal,filaFinal) || comprobarVertical(tablero, intColumnaInicio,filaInicio,intColumnaFinal,filaFinal);

    }


}
