/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airportontime.userinfo;

/**
 *
 * @author amitnandanp
 */
public class FlightInfo {
    private String flightNumber;
    private String sourceAirport;
    private String destinationAirport;

    public FlightInfo(String flightNumber, String sourceAirport, String destinationAirport) {
        this.flightNumber = flightNumber;
        this.sourceAirport = sourceAirport;
        this.destinationAirport = destinationAirport;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getSourceAirport() {
        return sourceAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }   
}
