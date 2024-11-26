package com.company;

public class Notification implements INotification{

    @Override
    public void send(String message) {
        System.out.println("Notification: " + message);
    }
}
