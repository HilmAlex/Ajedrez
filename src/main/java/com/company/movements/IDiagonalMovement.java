package com.company.movements;
import com.company.Tablero;

public interface IDiagonalMovement {

    default boolean comprobarDiagonal(Tablero tablero, int intColumnaInicio, int filaInicio, int intColumnaFinal, int filaFinal) {
        return Math.abs((intColumnaFinal-intColumnaInicio)/(filaFinal-filaInicio)) == 1 && comprobarInterseccion(tablero, intColumnaInicio, filaInicio, intColumnaFinal, filaFinal);
    }


    default boolean comprobarInterseccion(Tablero tablero, int intColumnaInicio, int filaInicio, int intColumnaFinal, int filaFinal){

        for (int i = filaInicio + 1, j=intColumnaInicio +1; i < filaFinal; i++,j++) {
            if (tablero.getCasillas(j, i).getPieza() != null) return false;
        }
        return true;
    }




}

