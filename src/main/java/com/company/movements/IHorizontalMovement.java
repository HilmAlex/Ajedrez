package com.company.movements;

//import com.company.model.Locker;
//import com.company.model.PositionOnBoard;

import com.company.Tablero;

import java.util.List;

/**
 * Esta interfaz determina los movimientos horizontales posibles de una pieza de ajedrez
 *      tomando en cuenta las limitaciones en cada pieza.
 * @author Alex Padilla
 */
public interface IHorizontalMovement{

    /**
     * Este método verifica que el movimiento de una pieza sea horizontal, si la columna inicial
     *      es igual a la fila final, entonces la pieza realizó un movimiento horizontal
     * @param //initialPosition Posicion inicial de la pieza
     * @param //finalPosition Posicion final de la pieza
     * @return Valor booleano que determina si el movimiento es vertical
     */
    default boolean comprobarHorizontal(Tablero tablero,int intColumnaInicio, int filaInicio, int intColumnaFinal, int filaFinal) {
        return intColumnaFinal == intColumnaInicio && comprobarInterseccionHorizontal(tablero, intColumnaInicio, filaInicio, intColumnaFinal, filaFinal);
    }

    /**
     * Este metodo calcula los movimientos verticales posibles de una pieza de ajedrez, realiza un
     *  cálculo de movimientos ascendentes y descendentes a través del método getSquares() de la interfaz
     *  Imovement para luego unirlos en una sola lista.
     * @param //lockers Casillas del tablero de ajedrez
     * @param //initialPosition Posicion inicial de la pieza
     * @return Lista de posiciones posibles
     */
    default boolean comprobarInterseccionHorizontal(Tablero tablero, int intColumnaInicio, int filaInicio, int intColumnaFinal, int filaFinal) {

        for (int i = filaInicio + 1; i < filaFinal; i++) {
            if (tablero.getCasillas(intColumnaInicio, i).getPieza() != null) return false;
        }
        return true;
    }



//    default List<PositionOnBoard> possibleHorizontalMovements(Locker[][] lockers, PositionOnBoard initialPosition) {
//        List<PositionOnBoard> possiblesMovements;
//        possiblesMovements = getSquares(lockers, initialPosition, 0,1);
//        possiblesMovements.addAll(getSquares(lockers,initialPosition, 0,-1));
//        return possiblesMovements;
//    }
}
