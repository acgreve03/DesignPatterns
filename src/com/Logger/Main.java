package com.Logger;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws Exception {
        /* LOGGER */
        //Logger User story 5
        Logger logger = Logger.getInstance();

        //logger user story 8 default to console
        logger.log("INFO", "info message");

        //logger user story 8 switching to file
        logger.setOutput(new FileLogOutput("test2.log"));
        logger.log("INFO", "info message");

        //logger user story 8 switching back to console
        logger.setOutput(new ConsoleLogOutput());
        logger.log("INFO", "Switched back to console!");

        //Logger User story 2

        logger.log("DEBUG", "debug message");
        logger.log("ERROR", "error message");

        //archive logs to a new file User story 7
        logger.archiveLogs("archive.log", true); // Clear log history after archiving

        //Logger User story 5
        //logger.closeLogFile();

        //Logger User Story 3
        System.out.println("\nLog History:");
        logger.getLogHistory().forEach(System.out::println);
    }
}
