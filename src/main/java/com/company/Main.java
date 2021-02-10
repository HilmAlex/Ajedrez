package com.company;

public class Main {

    public static void main(String[] args) {
        Jugador pepe = new Jugador("Pepe");
        Jugador pablo = new Jugador("Pablo");

        Tablero tablero = new Tablero();
        Partido partido = new Partido(pepe, pablo, tablero);

        //hola
        tablero.imprimirTablero();

        System.out.println(pepe.getColor());

        try {
            partido.registrarMovimiento(pepe, "a", 1, "a", 4);
            tablero.imprimirTablero();
            // partido.registrarMovimiento(pablo, "aGgG", 6, "g", 3);
            //partido.registrarMovimiento(pepe, "a", 6, "AAaa", 3);
        } catch (RegistrarMovimientoExcepcion e) {
            System.out.println("Ocurrió un error debido a " + e.getMessage());
        }


    }
}











