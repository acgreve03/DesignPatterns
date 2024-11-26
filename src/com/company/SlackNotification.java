package com.company;

public class SlackNotification implements INotification{
    @Override
    public void send(String message) {
        System.out.println("Slack notification: " + message);
    }
}
