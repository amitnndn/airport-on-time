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
public class TestClass {
    public static void main(String[] args){
        DriverArrivalTimeCalculator myETACalculator = new TrafficETACalculator();
        myETACalculator = new WeatherETACalculator(myETACalculator);
        myETACalculator = new DriverMiscETACalculator(myETACalculator);
        
        System.out.println(myETACalculator.getETA());
        
        PassengerArrivalTimeCalculator passengerETACalculator = new FlightETACalculator();
        passengerETACalculator = new BaggageETACalculator(passengerETACalculator);
        passengerETACalculator = new PassengerMiscETACalculator(passengerETACalculator);
        
        System.out.println(passengerETACalculator.getETA());
        
    }
}
