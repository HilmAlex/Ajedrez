package com.company;



public class Jugador {

    private final String nombreJugador;
    private boolean enPartida;
    private Color color;

    public Jugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }


    public void setEnPartida(boolean enPartida) {
        this.enPartida = enPartida;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public boolean isEnPartida() {
        return enPartida;
    }

    public Color getColor() {
        return color;
    }



}


