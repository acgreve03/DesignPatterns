package com.Logger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileLogOutput implements ILogOutput {
    private final PrintWriter writer;

    public FileLogOutput(String filePath) throws IOException{
        this.writer = new PrintWriter(new FileWriter(filePath, true));
    }

    @Override
    public void write(String message) {
        writer.println(message);
    }

    @Override
    public void close(){
        writer.close();
    }

}
