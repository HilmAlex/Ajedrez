package com.company;

public class Main {

    public static void main(String[] args) {
        Jugador pepe = new Jugador("Pepe");
        Jugador pablo = new Jugador("Pablo");

        Tablero tablero = new Tablero();
        Partido partido = new Partido(pepe, pablo, tablero);



        System.out.println();
        try {
            partido.registrarMovimiento(pepe, "z", 2, "zAaa", 3);
           // partido.registrarMovimiento(pablo, "aGgG", 6, "g", 3);
            //partido.registrarMovimiento(pepe, "a", 6, "AAaa", 3);
        }catch (RegistrarMovimientoExcepcion e) {
            System.out.println("Ocurrió un error debido a " + e.getMessage());
        }
        System.out.println();




    }
}











