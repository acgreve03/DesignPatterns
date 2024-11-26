package com.Notifications;

public class Main {

    public static void main(String[] args){

        INotification basic = new Notification();
        INotification sms = new SMSNotification();
        INotification email = new EmailNotification();
        INotification ping = new SlackNotification();

        Preferences p = new Preferences();
        p.addNotifChannel(basic);
        p.addNotifChannel(sms);
        p.addNotifChannel(email);
        p.addNotifChannel(ping);

        p.sendNotifs("Universal Notification: This should appear on all channels!");


        //sending basic notification user story 1
        String message = "PLease update to the latest OS ";
        basic.send(message);


        String text = "Come over for dinner tonight!";
        sms.send(text);


        String mail = "You are my favorite student. Regards, Dr. Parra-Rodriguez";
        email.send(mail);


        String msg = "Finish this sprint by the end of the day please.";
        ping.send(msg);

    }
}
