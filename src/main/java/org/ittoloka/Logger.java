package org.ittoloka;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by SeVlad on 18.09.2016.
 */
public class Logger {
    private ConsoleWriter consoleWriter;
    private FileWriter fileWriter;


    public void writeFile(String text){
        fileWriter.write(text);
    }
    public void writeConsole(String text){
        consoleWriter.write(text);
    }
    @Autowired
    public void setConsoleWriter(ConsoleWriter consoleWriter) {
        this.consoleWriter = consoleWriter;
    }
    @Autowired
    public void setFileWriter(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }
}
