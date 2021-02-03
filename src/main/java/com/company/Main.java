package com.company;

public class Main {

    public static void main(String[] args) {
        Jugador pepe = new Jugador("Pepe");
        Jugador pablo = new Jugador("Pablo");

        Partido partido = new Partido(pepe, pablo);

        Tablero tablero = new Tablero();

        // partido.iniciar();


        pepe.tableroJugador.imprimirTablero();

        System.out.println();
        pepe.mover("a", 2, "AAaa", 3);
        pablo.mover("gGgG", 7, "g", 3);

        System.out.println();
        pepe.tableroJugador.imprimirTablero();
        pablo.tableroJugador.imprimirTablero();


    }
}











