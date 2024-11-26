package com.company;

public class EmailNotification implements INotification {
    @Override
    public void send(String message) {
        System.out.println("Email Notification: " + message);
    }
}
