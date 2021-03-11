package org.academiadecodigo.cachealots.gridmapp;


import org.academiadecodigo.cachealots.gridmapp.Sound;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;

import java.security.Key;

public class Main {
    public static void main(String[] args) {

        // Instantiates GridMaker class with how many squares you wish
        GridMaker gridMaker = new GridMaker(25);
        // With initialized values, start making, drawing rectangles
        gridMaker.makeRectangles();

        Marker marker = new Marker(gridMaker); //  SET DEFAULT CURSOR POSITION

        Keyboard keyboard = new Keyboard(new MarkerKeyboardHandler(marker));

        keyboard.addEventListener(KeyboardEvent.KEY_LEFT, KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(KeyboardEvent.KEY_RIGHT, KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(KeyboardEvent.KEY_UP, KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(KeyboardEvent.KEY_DOWN, KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(KeyboardEvent.KEY_SPACE, KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(KeyboardEvent.KEY_C, KeyboardEventType.KEY_PRESSED);
        //keyboard.addEventListener(KeyboardEvent.KEY_SPACE, KeyboardEventType.KEY_RELEASED);
        keyboard.addEventListener(KeyboardEvent.KEY_V, KeyboardEventType.KEY_PRESSED);

        ReadWriteIO readWriteIO = new ReadWriteIO();
        readWriteIO.writeFileByLine();

        // L load last grid
        // S saves last grid
        // C clear
        // SPACE paint

        // Sound below this line
        /*Sound sound = new Sound("/resources/seashantywellermanofficialmusicvideo.wav");
        sound.play(true);

        while (true){

        }*/

    }
}
