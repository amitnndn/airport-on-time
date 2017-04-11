/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airportontime.notification;

/**
 *
 * @author amitnandanp
 */
public class PushNotification implements Notification {

    public PushNotification() {
        
    }
    @Override
    public void sendNotification() {
        System.out.println("Push notification sent");
    }
    
}
