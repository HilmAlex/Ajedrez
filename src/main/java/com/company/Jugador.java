package com.company;



public class Jugador {

    private final String nombreJugador;
    public Tablero tableroJugador;
    private boolean turno;
    private boolean enPartida;

    public Jugador(String nombreJugador) {
        this.tableroJugador = new Tablero();
        this.nombreJugador = nombreJugador;
    }


    public void mover(String columnaInicio, int filaInicio, String columnaFinal, int filaFinal) {

        int intColumnaInicio = columnaInicio.toUpperCase().charAt(0) - 65;
        int intColumnaFinal = columnaFinal.toUpperCase().charAt(0) - 65;

        tableroJugador.getCasillas(intColumnaFinal,filaFinal - 1).setPieza(tableroJugador.getCasillas(intColumnaInicio,filaInicio - 1).getPieza());

        tableroJugador.getCasillas(intColumnaInicio,filaInicio - 1).setPieza(null);

    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }

    public void setEnPartida(boolean enPartida) {
        this.enPartida = enPartida;
    }

    //TODO:  Quitar "tablero" como atributo de Jugador y ponerlo a Partida
    //TODO:  Verificar si un jugador está en una partida lo cual le permite jugar
    //TODO:  Verificar el turno de cada jugador
    //TODO:  Verificar que un jugador solo puede mover fichas de su color
    //TODO:  Verificar que los movimientos estén dentro del rango del tablero
    //TODO:  Verificar los movimientos posibles de cada pieza

}


