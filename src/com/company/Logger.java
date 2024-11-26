package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    //single instance of logger
    private static volatile Logger instance;
    private final List<String> logHistory;
    private ILogOutput output;

    //private constructor to prevent instantiation
    private Logger(){
        this.logHistory = new ArrayList<>();
        this.output = new ConsoleLogOutput(); //defaulting to console output
    }

    public static Logger getInstance(){
        if (instance == null){
            instance = new Logger();
        }
        return instance;
    }


    //configuring the logger's output dynamically
    public void setOutput(ILogOutput newOutput) throws Exception {
        if (output != null) {
            output.close(); // Close the current output if applicable
        }
        this.output = newOutput;
    }

    //log message with a severity level
    public void log(String severity, String message) {
        //set timestamp
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        String formattedMessage = String.format("[%s] [%s] %s", timestamp, severity.toUpperCase(), message);

        logHistory.add(formattedMessage);
        output.write(formattedMessage);

    }


    public List<String> getLogHistory() {
        return new ArrayList<>(logHistory); //returns copy of the log history
    }
/**
 * archives the log history to the specified file.
 *
 * @param archiveFilePath  file path to archive the logs
 * @param clearAfterArchive whether to clear the log history after archiving
 */
    public void archiveLogs(String archiveFilePath, boolean clearAfterArchive) throws IOException {
        try (PrintWriter archiveWriter = new PrintWriter(new FileWriter(archiveFilePath, true))) {
            for (String log : logHistory) {
                archiveWriter.println(log);
            }
        }

        if (clearAfterArchive) {
            logHistory.clear();
        }
    }

}
