package com.company;

public class Tablero {


    public Casilla[][] casillas = new Casilla[8][8];

    public Tablero() {
        instanciarCasilla();
        llenarTablero();
    }

    public void llenarTablero() {

        for (int j = 0; j < 8; j++) {
            casillas[1][j].setPieza( new Peon(Color.BLANCO) );
            casillas[6][j].setPieza( new Peon(Color.NEGRO) );
        }

        casillas[0][0].setPieza(new Torre(Color.BLANCO));
        casillas[7][7].setPieza(new Torre(Color.NEGRO));
        casillas[0][7].setPieza(new Torre(Color.BLANCO));
        casillas[7][0].setPieza(new Torre(Color.NEGRO));

        casillas[0][1].setPieza(new Caballo(Color.BLANCO));
        casillas[0][6].setPieza(new Caballo(Color.BLANCO));
        casillas[7][1].setPieza(new Caballo(Color.NEGRO));
        casillas[7][6].setPieza(new Caballo(Color.NEGRO));

        casillas[0][2].setPieza(new Alfil(Color.BLANCO));
        casillas[0][5].setPieza(new Alfil(Color.BLANCO));
        casillas[7][2].setPieza(new Alfil(Color.NEGRO));
        casillas[7][5].setPieza(new Alfil(Color.NEGRO));

        casillas[0][3].setPieza(new Reina(Color.BLANCO));
        casillas[7][3].setPieza(new Reina(Color.NEGRO));
        casillas[0][4].setPieza(new Rey(Color.BLANCO));
        casillas[7][4].setPieza(new Rey(Color.NEGRO));

    }



    public void instanciarCasilla(){
        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas.length; j++) {
                casillas[i][j] = new Casilla();
            }
        }
    }


    public void imprimirTablero(){
        String ra = "  |";
        String letra = "        ";
        for(int i=0;i<=7;i++){
            letra += Character.toString((char)( i + 65));
            letra += "           ";
        }
        for (int i= 1; i<=88 ; i++){
            ra += "-";
            if(i%11==0){
                ra += "|";
            }
        }
        System.out.println(letra);
        for (int i = 7; i >= 0; i--) {
            System.out.print(ra + "\n" + (i+1) + " |");
            for (int j = 0; j <= 7; j++) {
                System.out.printf("%-11s|", casillas[i][j].getPieza());
            }
            System.out.println(" " + (i+1));
        }
        System.out.println(ra + "\n" +letra);
    }


    public Casilla getCasillas(int columna, int fila){
        return casillas[fila][columna];
    }


}
