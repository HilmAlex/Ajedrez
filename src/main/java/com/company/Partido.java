package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Partido {
    private Jugador jugadorNegras;
    private Jugador jugadorBlancas;




    private ArrayList<Pieza> piezasBlancas = new ArrayList<Pieza>();
    private ArrayList<Pieza> piezasNegras = new ArrayList<Pieza>();

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

    private void cargarPiezas(){
        for (int i = 0; i < 8; i++) {


        piezasBlancas.add(new Peon(new Blanco(), new Posicion(2, String.valueOf((char)(i+65)))));
        piezasNegras.add(new Peon(new Negras(), new Posicion(7,"")));

        }
    }





    public void iniciar() {
        jugadorNegras

    }


}
