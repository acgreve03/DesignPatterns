package com.Notifications;

import com.sun.jdi.ArrayReference;

import java.util.ArrayList;

public class NotifHistory {

    private ArrayList<String> history = new ArrayList<>();

    public void log(String channel, String message){
        history.add("Channel: " + channel + " | Message: " + message);
    }

    public ArrayList<String> getHistory(){
        return history;
    }
}
