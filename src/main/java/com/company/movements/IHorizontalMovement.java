package com.company.movements;
import com.company.Tablero;

public interface IHorizontalMovement {


    default boolean comprobarHorizontal(Tablero tablero, int intColumnaInicio, int filaInicio, int intColumnaFinal, int filaFinal) {
        return filaInicio == filaFinal && comprobarInterseccionHorizontal(tablero, intColumnaInicio, filaInicio, intColumnaFinal, filaFinal);
    }


    default boolean comprobarInterseccionHorizontal(Tablero tablero, int intColumnaInicio, int filaInicio, int intColumnaFinal, int filaFinal) {



        if (filaInicio < filaFinal) {
            for (int i = filaInicio + 1; i < filaFinal; i++) {
                if (tablero.getCasillas(intColumnaInicio, i).getPieza() != null) return false;
            }
        }
        else{
            for (int i = filaInicio - 1; i > filaFinal; i--) {
                if (tablero.getCasillas(intColumnaInicio, i).getPieza() != null) return false;
            }
        }

        return true;
    }
}


