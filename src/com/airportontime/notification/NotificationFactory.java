/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airportontime.notification;

import com.airportontime.userinfo.Itinerary;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author amitnandanp
 */
public class NotificationFactory {
    private static NotificationFactory notificationFactory;
    private Itinerary itinerary;
    
    private NotificationFactory(Itinerary itinerary) {
        this.itinerary = itinerary;
    }
    
    //Using lazy instantiation to get the instance of Notifications at runtime
    public static NotificationFactory getInstance(Itinerary itinerary){
        if(notificationFactory == null){
            notificationFactory = new NotificationFactory(itinerary);
        }
        return notificationFactory;
    }
    
    public List<Notification> getNotifications() {
        List<Notification> preferences = new ArrayList<>();
        List<String> notifications = this.itinerary.getNotificationPreferences();
        for (String notification : notifications) {
            switch(notification) {
                case "email" : 
                    preferences.add(new EmailNotification("user.getEmail()"));
                    break;
                case "sms" : 
                    preferences.add(new TextNotification("user.getPhoneNumber()"));
                    break;
                case "push" : 
                    preferences.add(new PushNotification());
                    break;
                default: break;
            }
        }
        return preferences;
    } 
}
