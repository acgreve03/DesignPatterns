package com.company;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Logger {
    //single instance of logger
    private static volatile Logger instance;
    private final List<String> logHistory;
    private PrintWriter fileWriter;

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

    //configure file logging
    public void setLogFile(String filePath) throws IOException {
        if (fileWriter != null) {
            fileWriter.close(); //close existing writer, if any
        }
        this.fileWriter = new PrintWriter(new FileWriter(filePath, true));
    }
    public void log(String message){
        System.out.println(message);
    }

    //log message with a severity level
    public void log(String severity, String message) {
        String formattedMessage = String.format("[%s] %s", severity.toUpperCase(), message);
        logHistory.add(formattedMessage);
        System.out.println(formattedMessage);

        //write to file if file logging is configured
        if (fileWriter != null) {
            fileWriter.println(formattedMessage);
            fileWriter.flush(); //  writes to file imidiately
        }
    }


    public List<String> getLogHistory() {
        return new ArrayList<>(logHistory); //returns copy of the log history
    }

    public void closeLogFile() {
        if (fileWriter != null) {
            fileWriter.close(); // Close the file writer when done
        }
    }

}
