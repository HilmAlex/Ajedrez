package com.company.movements;

import com.company.Casilla;


public interface IMovement {

    default void pieceMoveInterface(
            Casilla[][] lockers, int initialRow, int initialColumn, int finalRow, int finalColumn)
    {
        lockers[finalRow][finalColumn].setPieza(lockers[initialRow][initialColumn].getPieza());
        lockers[initialRow][initialColumn].setPieza(null);
    }
}
