package org.ittoloka;

/**
 * Created by SeVlad on 18.09.2016.
 */
public class FileWriter implements Writer{
    public void write(String text) {
        System.out.println("Writing to file " + text);
    }
}
