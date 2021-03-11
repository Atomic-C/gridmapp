package org.academiadecodigo.cachealots.gridmapp;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteIO {

    public void writeFileByLine(String file, String text) throws IOException, IOException {

        // create a new file writer
        FileWriter writer = new FileWriter("/resources/gridmapp.txt");

        // wrap the file writer using a buffered writer
        BufferedWriter bWriter = new BufferedWriter(writer);

        //add text to buffer
        bWriter.write(text);

        bWriter.flush(); // if the buffer is not full, flush will force disk write
        bWriter.close(); // auto-flush is done on close

         
    }

}
