package com.Notifications;

public class SlackNotification implements INotification {

    private static NotifHistory history = new NotifHistory();

    @Override
    public void send(String message) {
        System.out.println("Slack notification: " + message);
        history.log("Slack: ", message);
    }

    // Getter for the history
    public static NotifHistory getHistory() {
        return history;
    }
}
