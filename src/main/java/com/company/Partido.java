package com.company;

public class Partido {
    private Jugador jugadorNegras;
    private Jugador jugadorBlancas;
    private Tablero tablero;



    public Partido(Jugador jugador1, Jugador jugador2) {
        iniciar(jugador1, jugador2);
    }

    private void definirColorJugador(Jugador jugador1, Jugador jugador2) {
        int numero = (int) (Math.random() * 2);
        if (numero == 0) {
            this.jugadorBlancas = jugador1;
            this.jugadorNegras = jugador2;
        } else {
            this.jugadorBlancas = jugador2;
            this.jugadorNegras = jugador1;
        }
    }

    public void iniciar(Jugador jugador1, Jugador jugador2){
        definirColorJugador(jugador1, jugador2);
        this.tablero = new Tablero();
        jugadorBlancas.setTurno(true);

    }

    public Jugador getJugadorNegras() {
        return jugadorNegras;
    }

    public Jugador getJugadorBlancas() {
        return jugadorBlancas;
    }
}









