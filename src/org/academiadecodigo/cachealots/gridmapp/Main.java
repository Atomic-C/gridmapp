package org.academiadecodigo.cachealots.gridmapp;


public class Main {
    public static void main(String[] args) {

        // Instantiates GridMaker class with how many squares you wish
        GridMaker gridMaker = new GridMaker(50);
        // With initialized values, start making, drawing rectangles
        gridMaker.makeRectangles();
        //
        Marker marker = new Marker(gridMaker);

    }
}
