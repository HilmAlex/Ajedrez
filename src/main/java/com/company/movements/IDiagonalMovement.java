package com.company.movements;

import com.company.Tablero;

import java.util.List;

/**
 * Esta interfaz determina los movimientos diagonales posibles de una pieza de ajedrez
 *      tomando en cuenta las limitaciones en cada pieza.
 * @author Alex Padilla
 */
public interface IDiagonalMovement {
    /**
     * Este método verifica si el movimiento es diagonal comparando la pendiente entre la posicion inicial
     *      y la posible posicion final, si esta es igual a 1, entonces el movimiento es diagonal.
     */
    default boolean comprobarDiagonal(Tablero tablero, int intColumnaInicio, int filaInicio, int intColumnaFinal, int filaFinal) {
        return Math.abs((intColumnaFinal-intColumnaInicio)/(filaFinal-filaInicio)) == 1 && comprobarInterseccion(tablero, intColumnaInicio, filaInicio, intColumnaFinal, filaFinal);
    }


    default boolean comprobarInterseccion(Tablero tablero, int intColumnaInicio, int filaInicio, int intColumnaFinal, int filaFinal){

        for (int i = filaInicio + 1, j=intColumnaInicio +1; i < filaFinal; i++,j++) {
            if (tablero.getCasillas(j, i).getPieza() != null) return false;
        }
        return true;
    }


    /**
     * Este metodo calcula los movimientos verticales posibles de una pieza de ajedrez, realiza un
     *  cálculo de movimientos ascendentes y descendentes a través del método getSquares() de la interfaz
     *  Imovement para luego unirlos en una sola lista.
     * @param lockers Casillas del tablero de ajedrez
     * @param initialPosition Posicion inicial de la pieza
     * @return Lista de posiciones posibles
     */



}

