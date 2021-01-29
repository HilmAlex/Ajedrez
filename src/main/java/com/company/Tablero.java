package com.company;

import java.util.HashMap;

public class Tablero {

    private HashMap<Character, HashMap<Integer, Casilla>> posicion = new HashMap<Character,
            HashMap<Integer, Casilla>>();

    private Casilla[][] casillas = new Casilla[8][8];

    public void llenarTablero() {
        HashMap<Integer, Casilla> posicionNumeros = new HashMap<Integer, Casilla>();
        for (int i = 0; i < 7; i++) {


            for (int j = 0; j < 7; j++) {
                posicionNumeros.put(j, new Casilla());

            }
            posicion.put((char) (i + 65), posicionNumeros);

        }
    }



}
