package com.company;

public class SMSNotification implements INotification {

    private static NotifHistory history = new NotifHistory();


    @Override
    public void send(String message) {
        System.out.println("SMS notification: " + message);
        history.log("SMS", message);

    }
    // Getter for the history
    public static NotifHistory getHistory() {
        return history;
    }
}
