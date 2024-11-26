package com.Notifications;

public class Notification implements INotification {
    private static NotifHistory history = new NotifHistory();


    @Override
    public void send(String message) {
        System.out.println("Notification: " + message);
        history.log("Basic", message);
    }

    public static NotifHistory getHistory(){
        return history;
    }
}
