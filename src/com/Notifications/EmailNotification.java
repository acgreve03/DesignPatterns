package com.Notifications;

public class EmailNotification implements INotification {
    private static NotifHistory history = new NotifHistory();

    @Override
    public void send(String message) {
        System.out.println("Email Notification: " + message);
        history.log("Email: ", message);
    }

    public static NotifHistory getHistory(){
        return history;
    }
}
