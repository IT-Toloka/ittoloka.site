package org.ittoloka;

/**
 * Created by SeVlad on 18.09.2016.
 */
public class ConsoleWriter implements Writer {
    public void write(String text) {
        System.out.println(text);
    }
}
