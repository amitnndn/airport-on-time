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
public class EmailNotification implements Notification {
    
    private String recepient; 
    
    public EmailNotification(String recepient) {
        this.recepient = recepient;
    }
    
    public void sendNotification(){
        System.out.println("Email Notification Sent");
    }
    
}
