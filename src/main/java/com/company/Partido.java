package com.company;

public class Partido {
    private Tablero tablero;
    private Color turnoColor = Color.BLANCO;

    public Partido(Jugador jugador1, Jugador jugador2, Tablero tablero) {
        this.tablero = tablero;
        iniciar(jugador1, jugador2);
    }

    private void definirColorJugador(Jugador jugador1, Jugador jugador2) {
        int numero = (int) (Math.random() * 2);
        if (numero == 0) {
//            jugador1.setTurno(true);
//            jugador2.setTurno(false);
            jugador1.setColor(Color.BLANCO);
            jugador2.setColor(Color.NEGRO);
        } else {
//            jugador1.setTurno(false);
//            jugador2.setTurno(true);
            jugador1.setColor(Color.NEGRO);
            jugador2.setColor(Color.BLANCO);
        }
    }

    public void iniciar(Jugador jugador1, Jugador jugador2) {
        definirColorJugador(jugador1, jugador2);
        jugador1.setEnPartida(true);
        jugador2.setEnPartida(true);
    }

    public void registrarMovimiento(Jugador jugador, String columnaInicio, int filaInicio, String columnaFinal, int filaFinal) throws RegistrarMovimientoExcepcion {


        //TODO:  Verificar si un jugador está en una partida lo cual le permite jugar
        if (!jugador.isEnPartida()) {
            throw new RegistrarMovimientoExcepcion("El jugador no se encuentra en partida");
        }


        //TODO:  Verificar el turno de cada jugador
        if (!jugador.getColor().equals(turnoColor)) {
            throw new RegistrarMovimientoExcepcion("Jugador " + jugador.getNombreJugador() + " de color " + jugador.getColor() + " No es " + "su turno. El turno es del color " + turnoColor);
        }


        int intColumnaInicio = columnaInicio.toUpperCase().charAt(0) - 65;
        int intColumnaFinal = columnaFinal.toUpperCase().charAt(0) - 65;



        //TODO:  Verificar que los movimientos estén dentro del rango del tablero
        if (!((intColumnaFinal < 8) && (filaFinal < 8) && (intColumnaFinal >= 0) && (filaFinal >= 0) && (intColumnaInicio < 8) && (filaInicio < 8) && (intColumnaInicio >= 0) && (filaInicio >= 0))) {
            throw new RegistrarMovimientoExcepcion("Se intentó acceder a una casilla fuera del tablero");
        }


        //TODO:  Verificar que un jugador solo puede mover fichas de su color
        Color colorPiezaAMover = tablero.getCasillas(intColumnaInicio, filaInicio).getPieza().getColor();

        if (!colorPiezaAMover.equals(turnoColor)) {
            throw new RegistrarMovimientoExcepcion("Jugador " + jugador.getNombreJugador() + " de color " + jugador.getColor() + " no " + "puede mover la ficha del color " + colorPiezaAMover);
        }


        //TODO: Verificar que una pieza puede moverse acorde a sus características
        if(!tablero.getCasillas(intColumnaInicio, filaInicio).getPieza().comprobarMovimiento()){
            throw new RegistrarMovimientoExcepcion("Movimiento de pieza no válida");
        }





        tablero.getCasillas(intColumnaFinal, filaFinal - 1).setPieza(tablero.getCasillas(intColumnaInicio,
                filaInicio - 1).getPieza());
        tablero.getCasillas(intColumnaInicio, filaInicio - 1).setPieza(null);
        turnoColor = turnoColor.equals(Color.NEGRO) ? Color.BLANCO : Color.NEGRO;

    }
}









