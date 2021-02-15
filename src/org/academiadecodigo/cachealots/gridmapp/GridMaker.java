package org.academiadecodigo.cachealots.gridmapp;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;


public class GridMaker {

    // Class properties here
    public Rectangle[][] rectangles;
    private int x;
    private int y;
    private int width;
    private int height;
    private int numnberOfSquares;

    // Class constructor here
    public GridMaker(int numnberOfSquares){

        // Initiate rectangles variables here
        this.rectangles = new Rectangle[numnberOfSquares][numnberOfSquares];
        this.x = 10;
        this.y = 10;
        this.height = 15;
        this.width = 15;

    }


    // Method that makes rectangles
    public void makeRectangles(){

        for (int i = 0; i < rectangles.length; i++) {
            for (int k = 0; k < rectangles[i].length; k++) {
                System.out.println(rectangles[k].length);
                rectangles[i][k] = new Rectangle(x,y, height,width);

                rectangles[i][k].setColor(Color.BLUE); // Always [i][k]

                rectangles[i][k].draw();

                x += 10 + width;
                try {
                    Thread.sleep(25);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            x = 10;
            y += 10 + height;

        }

    }

}
