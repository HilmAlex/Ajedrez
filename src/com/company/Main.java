package com.company;

public class Main {

    public static void main(String[] args) {
        Jugador pepe = new Jugador("pepe");
        Jugador pablo = new Jugador("pablo");
        Partido partido = new Partido(pepe, pablo);
        partido.iniciar();
        System.out.println("hola haciendo prueba");
        System.out.println("hola haciendo prueb2222a");

    }
}
