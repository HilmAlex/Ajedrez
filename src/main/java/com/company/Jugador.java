package com.company;



public class Jugador {

    private final String nombreJugador;
//    private boolean turno;
    private boolean enPartida;
    private Color color;

    public Jugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }




//    public void setTurno(boolean turno) {
//        this.turno = turno;
//    }

    public void setEnPartida(boolean enPartida) {
        this.enPartida = enPartida;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

//    public boolean isTurno() {
//        return turno;
//    }

    public boolean isEnPartida() {
        return enPartida;
    }

    public Color getColor() {
        return color;
    }

    //TODO:  Verificar los movimientos posibles de cada pieza

}


