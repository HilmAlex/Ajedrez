package com.company.movements;

import com.company.Casilla;
import com.company.Tablero;
//import com.company.model.Locker;
//import com.company.model.PositionOnBoard;

import java.util.List;

/**
 * Esta interfaz determina los movimientos verticales posibles de una pieza de ajedrez tom ando en cuenta las
 * limitaciones en cada pieza.
 *
 * @author Alex Padilla
 */

public interface IVerticalMovement {

    /**
     * Este método verifica que el movimiento de una pieza sea vertical, si la fila inicial es igual a la fila final,
     * entonces la pieza realizó un movimiento vertical
     *
     * @param //initialPosition Posicion inicial de la pieza
     * @param //finalPosition   Posicion final de la pieza
     * @return Valor booleano que determina si el movimiento es vertical
     */
    default boolean comprobarVertical(Tablero tablero, int intColumnaInicio, int filaInicio, int intColumnaFinal, int filaFinal) {
        return filaInicio == filaFinal && comprobarInterseccionVertical(tablero, intColumnaInicio, filaInicio, intColumnaFinal, filaFinal);
    }

    /**
     * Este metodo calcula los movimientos verticales posibles de una pieza de ajedrez, realiza un cálculo de
     * movimientos ascendentes y descendentes a través del método getSquares() de la interfaz Imovement para luego
     * unirlos en una sola lista.
     *
     * @param //lockers         Casillas del tablero de ajedrez
     * @param //initialPosition Posicion inicial de la pieza
     * @return Lista de posiciones posibles
     */

    default boolean comprobarInterseccionVertical(Tablero tablero, int intColumnaInicio, int filaInicio, int intColumnaFinal, int filaFinal) {

        for (int i = intColumnaInicio + 1; i < intColumnaFinal; i++) {
            if (tablero.getCasillas(i, filaFinal).getPieza() != null) return false;
        }
        return true;
    }


//    default List<PositionOnBoard> possibleVerticalMovements(Locker[][] lockers, PositionOnBoard initialPosition) {
//        List<PositionOnBoard> possiblesMovements;
//        possiblesMovements = getSquares(lockers, initialPosition, 1,0);
//        possiblesMovements.addAll(getSquares(lockers,initialPosition, -1,0));
//        return possiblesMovements;
//    }
}

