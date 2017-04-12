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
public class BaggageETACalculator extends OtherPassengerETACalculator {

    public BaggageETACalculator(PassengerArrivalTimeCalculator trailingETACalculator) {
        super(trailingETACalculator);
    }
    
    public double getETA() {
        return 2.5 + super.callTrailer();
    }
}
