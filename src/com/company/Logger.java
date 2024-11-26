package com.company;

import java.util.ArrayList;
import java.util.List;

public class Logger {
    //single instance of logger
    private static volatile Logger instance;
    private final List<String> logHistory;

    //private constructor to prevent instantiation
    private Logger(){
        this.logHistory = new ArrayList<>();
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
        logHistory.add(formattedMessage);
        System.out.println(formattedMessage);
    }


    public List<String> getLogHistory() {
        return new ArrayList<>(logHistory); //returns copy of the log history
    }

}
