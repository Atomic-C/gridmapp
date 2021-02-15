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
                //marker.moveRight(); // Start moving methods here
                System.out.println("RIGHT");
                break;
            case KeyboardEvent.KEY_LEFT:
                System.out.println("LEFT");
                break;
            case KeyboardEvent.KEY_UP:
                System.out.println("UP");
                break;
            case KeyboardEvent.KEY_DOWN:
                System.out.println("DOWN");
                break;
            case KeyboardEvent.KEY_SPACE:
                System.out.println("SPACE PRINT!");
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

}