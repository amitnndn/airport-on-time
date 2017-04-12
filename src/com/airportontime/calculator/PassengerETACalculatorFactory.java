/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airportontime.calculator;

import com.airportontime.userinfo.Itinerary;

/**
 *
 * @author amitnandanp
 */
public class PassengerETACalculatorFactory {
    private Itinerary itinerary;

    public PassengerETACalculatorFactory(Itinerary itinerary) {
        this.itinerary = itinerary;
    }
    
    public PassengerArrivalTimeCalculator factory() {
        PassengerArrivalTimeCalculator passengerETA = new FlightETACalculator();
        if(itinerary.getBaggageInfo() > 0){
            passengerETA = new BaggageETACalculator(passengerETA);
        }
        passengerETA = new PassengerMiscETACalculator(passengerETA);
        return passengerETA;
    }
}
