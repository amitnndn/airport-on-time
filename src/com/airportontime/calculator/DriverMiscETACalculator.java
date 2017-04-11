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
public class DriverMiscETACalculator extends OtherDriverETACalculator {

    public DriverMiscETACalculator(DriverArrivalTimeCalculator trailngETACalculator) {
        super(trailngETACalculator);
    }
    
    @Override
    public double getETA(){
//        TODO: Get misc ETA from itineary
        return 2.5 + super.callTrailer(); 
    }
}
