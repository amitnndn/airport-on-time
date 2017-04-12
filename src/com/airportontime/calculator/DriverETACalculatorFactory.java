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
public class DriverETACalculatorFactory {
    private Itinerary itinerary; 

    public DriverETACalculatorFactory(Itinerary itinerary) {
        this.itinerary = itinerary;
    }
    
    public DriverArrivalTimeCalculator factory() {
        DriverArrivalTimeCalculator driverETA = new TrafficETACalculator();
        driverETA = new WeatherETACalculator(driverETA);
        if(itinerary.getMiscStops().getTime() > 0){
            driverETA = new DriverMiscETACalculator(driverETA);
        }

        return driverETA;
    }
    
    
}
