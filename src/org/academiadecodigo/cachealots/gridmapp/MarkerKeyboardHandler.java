package org.academiadecodigo.cachealots.gridmapp;

import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class MarkerKeyboardHandler implements KeyboardHandler {
    // Class properties here
    private Marker marker;
    private Sound eraseSound;
    private Sound writeSound;
    private Sound eraseSoundSmall;
    private Sound moveSound;

    // Constructor below
    public MarkerKeyboardHandler(Marker marker) {
        this.marker = marker;
        this.eraseSound = new Sound("/resources/dltebtn.wav");
        this.eraseSoundSmall = new Sound("/resources/smalldltbtn.wav");
        this.writeSound = new Sound("/resources/deepestbtnsnd.wav");
        this.moveSound = new Sound("/resources/mvbttn.wav");
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch(keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_RIGHT:
                marker.moveRight(); // Start moving methods here
                moveSound.play(true); // We invoke sound here
                //System.out.println("RIGHT");
                break;
            case KeyboardEvent.KEY_LEFT:
                marker.moveLeft();
                moveSound.play(true); // We invoke sound here
                //System.out.println("LEFT");
                break;
            case KeyboardEvent.KEY_UP:
                marker.moveUp();
                moveSound.play(true); // We invoke sound here
                //System.out.println("UP");
                break;
            case KeyboardEvent.KEY_DOWN:
                marker.moveDown();
                moveSound.play(true); // We invoke sound here
                //System.out.println("DOWN");
                break;
            case KeyboardEvent.KEY_SPACE:
                marker.paint();
                writeSound.play(true); // We invoke sound here
                //System.out.println("SPACE PRINT!");
                break;
            case KeyboardEvent.KEY_V:
                marker.eraseIfFilled();
                eraseSoundSmall.play(true); // We invoke sound here
                //System.out.println("Pressing V to delete individual rectangles");
                break;
            case KeyboardEvent.KEY_C:
                marker.erase();
                eraseSound.play(true); // We invoke sound here
                //System.out.println("Pressing C to delete the whole grid");
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

}
