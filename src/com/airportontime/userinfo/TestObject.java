/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airportontime.userinfo;

import com.airportontime.calculator.TTLAndETACalculatorObservable;
import com.airportontime.notification.NotificationFactory;
import com.airportontime.notification.NotificationObserver;
import com.airportontime.generic.Location;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author amitnandanp
 */
public class TestObject {
    
    public static void main(String[] args){
        User user = new User("amit_nndn@yahoo.co.in", "9522283890", "Amit", "Nandan");
        
        Location location = new Location(123.4, 1232.5);
        
        List<String> preferences = setNotificationPreferences();
 
        Itinerary itinerary;
        itinerary = new Itinerary(1, "04/12/2017", preferences, "DA101", "LAX", "MSP", user, location, "Fueling",10);
        
        NotificationObserver observer = new NotificationObserver(itinerary);
        
        TTLAndETACalculatorObservable calculator = new TTLAndETACalculatorObservable(itinerary);
        
        calculator.attach(observer);
        
        calculator.calculateTTL();
        
    }
    
    public static List<String> setNotificationPreferences(){
        List<String> notificaitonPreferences = new ArrayList<>();
        notificaitonPreferences.add("email");
        notificaitonPreferences.add("sms");
        notificaitonPreferences.add("push");
        return notificaitonPreferences;
    }
}
