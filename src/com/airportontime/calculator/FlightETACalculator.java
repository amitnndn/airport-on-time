/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airportontime.calculator;

import com.airportontime.external.FlightStratergy;

/**
 *
 * @author amitnandanp
 */
public class FlightETACalculator extends PassengerArrivalTimeCalculator{
    private FlightStratergy flight;
    
    public FlightETACalculator() {
        flight = new FlightStratergy();
    }
    @Override
    public double getETA() {
        return flight.getETA();
    }
    
}
