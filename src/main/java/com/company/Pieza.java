package com.company;

public class Pieza {

    private Color color;

    public Pieza(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return " " + getClass().getName().substring(12) + " " +color.toString().charAt(0);
    }
}
