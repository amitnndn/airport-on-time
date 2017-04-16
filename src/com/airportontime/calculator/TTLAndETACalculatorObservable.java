/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airportontime.calculator;

import com.airportontime.notification.NotificationObserver;
import com.airportontime.userinfo.Itinerary;

/**
 *
 * @author amitnandanp
 */
public class TTLAndETACalculatorObservable {
    private NotificationObserver observer;
    private Itinerary itinerary;
    private DriverArrivalTimeCalculator driverETA;
    private PassengerArrivalTimeCalculator passengerETA;
    private DriverETACalculatorFactory driverETAFactory;
    private PassengerETACalculatorFactory passengerETAFactory;

    public TTLAndETACalculatorObservable(Itinerary itinerary) {
        this.observer = observer;
        this.itinerary = itinerary;
        driverETAFactory = new DriverETACalculatorFactory(itinerary);
        passengerETAFactory = new PassengerETACalculatorFactory(itinerary);        
    }
    
    public void calculateTTL(){
        driverETA = driverETAFactory.factory();
        passengerETA = passengerETAFactory.factory();
        if(driverETA.getETA() == passengerETA.getETA()){
            observer.sendNotification();
        }
    }
    
    public void attach(NotificationObserver observer){
        this.observer = observer;
    }
}
