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

    //log message with a severity level
    public void log(String severity, String message) {
        String formattedMessage = String.format("[%s] %s", severity.toUpperCase(), message);
        System.out.println(formattedMessage);
    }

}
