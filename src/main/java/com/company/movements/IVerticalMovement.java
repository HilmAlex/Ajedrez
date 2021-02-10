package com.company.movements;
import com.company.Tablero;

public interface IVerticalMovement {

    default boolean comprobarVertical(Tablero tablero, int intColumnaInicio, int filaInicio, int intColumnaFinal, int filaFinal) {
        return filaInicio == filaFinal && comprobarInterseccionVertical(tablero, intColumnaInicio, filaInicio, intColumnaFinal, filaFinal);
    }

    default boolean comprobarInterseccionVertical(Tablero tablero, int intColumnaInicio, int filaInicio, int intColumnaFinal, int filaFinal) {

        for (int i = intColumnaInicio + 1; i < intColumnaFinal; i++) {
            if (tablero.getCasillas(i, filaFinal).getPieza() != null) return false;
        }
        return true;
    }

}


