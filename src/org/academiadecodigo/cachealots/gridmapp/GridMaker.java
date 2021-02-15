package org.academiadecodigo.cachealots.gridmapp;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

// This is the class responsible for making a grid.
public class GridMaker {

    // Class properties here
    public Rectangle[][] rectangles;
    private int x;
    private int y;
    private int width;
    private int height;
    private int numnberOfSquares;

    // Class constructor here
    public GridMaker(int numberOfSquares){

        // Initiate rectangles variables here
        this.numnberOfSquares = numberOfSquares;

        this.rectangles = new Rectangle[this.numnberOfSquares][this.numnberOfSquares]; // numberOfSquares passed

        // Starter variables when initiating the grid position and square each size
        this.x = 10;
        this.y = 10;
        this.height = 15;
        this.width = 15;

    }


    // Method that makes rectangles using double array and two for loops for each position [i][k]
    public void makeRectangles(){

        for (int i = 0; i < rectangles.length; i++) {
            for (int k = 0; k < rectangles[i].length; k++) {
                // System.out.println(rectangles[k].length); // Use this to debug
                rectangles[i][k] = new Rectangle(x,y, height,width);

                rectangles[i][k].setColor(Color.BLUE); // Always [i][k] order

                rectangles[i][k].draw(); // Draw the rectangles.................

                x += 2 + width; // Set width space between squares
                try {
                    Thread.sleep(1 ); // Delay so we can see the grid being drawn
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            x = 10;
            y += 2 + height; // Set height space between squares

        }

    }

}
