package com.company;

public class Main {

    public static void main(String[] args) {
        Jugador pepe = new Jugador("Pepe");
        Jugador pablo = new Jugador("Pablo");

        Partido partido = new Partido(pepe, pablo);

       // partido.iniciar();

        Tablero tablero = new Tablero();
        tablero.imprimirCasilla();

        pepe.mover(1,0,2,0);

    }
}
