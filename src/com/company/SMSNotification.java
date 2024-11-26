package com.company;

public class SMSNotification implements INotification {

    @Override
    public void send(String message) {
        System.out.println("SMS notification: " + message);
    }
}
