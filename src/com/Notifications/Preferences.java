package com.Notifications;

import com.Notifications.INotification;

import java.util.ArrayList;

public class Preferences {
    private ArrayList<INotification> prefferedNotifications = new ArrayList<>();

    //add notif channel
    public void addNotifChannel(INotification notif){
        prefferedNotifications.add(notif);
    }

    //remove notif channel
    public void removeNotifChannel(INotification notif){
        prefferedNotifications.remove(notif);
    }

    public void sendNotifs(String s){
        for (INotification n : prefferedNotifications){
            n.send(s);
        }
    }

}
