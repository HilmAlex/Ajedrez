package com.company;

public class Main {

    public static void main(String[] args) {
        Jugador pepe = new Jugador("pepe");
        Jugador pablo = new Jugador("pablo");
        Partido partido = new Partido(pepe, pablo);
        //partido.iniciar();
        //pepe.mover(a2, a3);
        System.out.println("hola");
    }
}
