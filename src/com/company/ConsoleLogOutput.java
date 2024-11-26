package com.company;

public class ConsoleLogOutput implements ILogOutput{

    @Override
    public void write(String message) {
        System.out.println(message);
    }

    @Override
    public void close()  {
    //since this is console output we don't need to close
    }
}
