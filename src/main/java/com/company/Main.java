package com.company;

public class Main {

    public static void main(String[] args) {
        Jugador pepe = new Jugador("Pepe");
        Jugador pablo = new Jugador("Pablo");

        Partido partido = new Partido(pepe, pablo);

        partido.iniciar();



        pepe.mover(a2, a3);
    }
}
