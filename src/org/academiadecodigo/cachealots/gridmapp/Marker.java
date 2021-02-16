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


        // Starter variables when initiating the grid position and square each size // We can use inheritance here
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
        Rectangle[][] rectangleHolder = gridMaker.getRectangles(); // TODO: How can I compare Marker and grid Rectangles? // HOW?!?!?

        for (int i = 0; i < rectangleHolder.length; i++) {
            for (int j = 0; j < rectangleHolder[i].length; j++) { // Iterate over dual dimensional array...
                    // here
                if( rectangleHolder[i][j].getX() == markerRectangle.getX() && rectangleHolder[i][j].getY() == markerRectangle.getY()){ // When we find the cursor...
                    // we can now paint!!!
                    rectangleHolder[i][j].setColor(Color.BLUE); // It's supposed to paint as we hover over for now
                    rectangleHolder[i][j].fill();
                }

            }

        }
    }

}
