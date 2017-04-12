/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airportontime.calculator;

/**
 *
 * @author amitnandanp
 */
abstract public class OtherPassengerETACalculator extends PassengerArrivalTimeCalculator {
    public PassengerArrivalTimeCalculator trailingETACalculator;

    public OtherPassengerETACalculator(PassengerArrivalTimeCalculator trailingETACalculator) {
        this.trailingETACalculator = trailingETACalculator;
    }
    
    public double callTrailer() {
        if(trailingETACalculator != null) {
            return trailingETACalculator.getETA();
        }
        return 0;
    }
}
