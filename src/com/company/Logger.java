package com.company;

public class Logger {
    //single instance of logger
    private static volatile Logger instance;

    //private constructor to prevent instantiation
    private Logger(){
    }

    public static Logger getInstance(){
        if (instance == null){
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message){
        System.out.println(message);
    }

}
