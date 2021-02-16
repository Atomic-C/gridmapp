package org.academiadecodigo.cachealots.gridmapp;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

// This is the class responsible for marking the grid.
public class Marker {
    // Class properties here
    private GridMaker gridMaker;
    // Properties for cursor position below
    private int x;
    private int y;
    private int width;
    private int height;
    public Rectangle markerRectangle;

    public Marker(GridMaker gridMaker) { // Now Marker constructor asks to pass variable of type GridMaker
       this.gridMaker = gridMaker;


        // Starter variables when initiating the grid position and square each size
        this.x = 10;
        this.y = 10;
        this.height = 15;
        this.width = 15;
        this.markerRectangle = new Rectangle(x,y,width,height);
        markerRectangle.setColor(Color.RED);
        markerRectangle.fill();


    }

    //TODO:
    //methods
    //moveUp
    //moveDown
    //moveLeft

    public void moveRight() {
        markerRectangle.translate(17, 0);
    }

    public void moveLeft() {
        markerRectangle.translate(-17, 0);
    }

    public void moveUp() {
        markerRectangle.translate(0, -17);
    }

    public void moveDown() {
        markerRectangle.translate(0, 17); // x and y change themselves
    }

    public void paint(){
        Rectangle[][] rectangleHolder = gridMaker.getRectangles(); // TODO: How can I compare Marker and grid Rectangles?

        for (int i = 0; i < rectangleHolder.length; i++) {
            for (int j = 0; j < rectangleHolder[i].length; j++) {

                if(( rectangleHolder[i][j].getX() && rectangleHolder[i][j].getY() ) == markerRectangle.getX() && markerRectangle.getY()){

                }

            }

        }
    }

}
