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
abstract public class OtherDriverETACalculator extends DriverArrivalTimeCalculator {
    private DriverArrivalTimeCalculator trailngETACalculator;

    public OtherDriverETACalculator(DriverArrivalTimeCalculator trailngETACalculator) {
        this.trailngETACalculator = trailngETACalculator;
    }

    public double callTrailer(){
        if(trailngETACalculator != null) {
            return trailngETACalculator.getETA();
        }
        return 0;
    }
    
}
