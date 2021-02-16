package org.academiadecodigo.cachealots.gridmapp;


import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;

public class Main {
    public static void main(String[] args) {

        // Instantiates GridMaker class with how many squares you wish
        GridMaker gridMaker = new GridMaker(25);
        // With initialized values, start making, drawing rectangles
        gridMaker.makeRectangles();

        Marker marker = new Marker(gridMaker); // TODO: SET DEFAULT CURSOR POSITION

        Keyboard keyboard = new Keyboard(new MarkerKeyboardHandler(marker));

        keyboard.addEventListener(KeyboardEvent.KEY_LEFT, KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(KeyboardEvent.KEY_RIGHT, KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(KeyboardEvent.KEY_UP, KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(KeyboardEvent.KEY_DOWN, KeyboardEventType.KEY_PRESSED);

        //

    }
}
