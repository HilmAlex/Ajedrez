package com.company;

public class Partido {
    private Jugador jugadorNegras;
    private Jugador jugadorBlancas;

    public Partido(Jugador jugador1, Jugador jugador2) {
        definirColor(jugador1, jugador2);

    }

    public void definirColor(Jugador jugador1, Jugador jugador2) {
        int numero = (int) (Math.random() * 2);
        if (numero == 0) {
            this.jugadorBlancas = jugador1;
            this.jugadorNegras = jugador2;
        } else {
            this.jugadorBlancas = jugador2;
            this.jugadorNegras = jugador1;
        }
    }

    public void iniciar() {
    }


}
