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
public class NotificationObserver {
    
    private NotificationFactory notificationFactory;
    
    private List<Notification> notifications = new ArrayList<>();
    
    public NotificationObserver(Itinerary itinerary) {
        this.notificationFactory = NotificationFactory.getInstance(itinerary);
    }
    
    public void sendNotification(){
        notifications = notificationFactory.getNotifications();
        notifications.forEach((notification) -> {
            notification.sendNotification();
        });
    }
}
