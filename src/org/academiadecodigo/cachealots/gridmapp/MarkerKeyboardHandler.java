package org.academiadecodigo.cachealots.gridmapp;

import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class MarkerKeyboardHandler implements KeyboardHandler {
    // Class properties here
    private Marker marker;

    // Constructor below
    public MarkerKeyboardHandler(Marker marker) {
        this.marker = marker;
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch(keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_RIGHT:
                marker.moveRight(); // Start moving methods here
                System.out.println("RIGHT");
                break;
            case KeyboardEvent.KEY_LEFT:
                marker.moveLeft();
                System.out.println("LEFT");
                break;
            case KeyboardEvent.KEY_UP:
                marker.moveUp();
                System.out.println("UP");
                break;
            case KeyboardEvent.KEY_DOWN:
                marker.moveDown();
                System.out.println("DOWN");
                break;
            case KeyboardEvent.KEY_SPACE:
                System.out.println("SPACE PRINT!");
                marker.paint();
                break;
            case KeyboardEvent.KEY_V:
                System.out.println("Pressing V to delete individual rectangles");
                marker.eraseIfFilled();
                break;
            case KeyboardEvent.KEY_C:
                System.out.println("Pressing C to delete the whole grid");
                marker.erase();
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

}
