/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airportontime.userinfo;

import java.util.List;
import com.airportontime.generic.Location;

/**
 *
 * @author amitnandanp
 */
public class Itinerary {
    private int baggage; 
    private String date; 
    private List<String> notificationPreferences;
    private FlightInfo flightInfo;
    private User user;
    private Location source;
    private MiscStops miscStops;

    public Itinerary(int baggage, String date, List<String> notificationPreferences, String flightNumber,
            String sourceAirport, String destinationAirport, User user, Location location,
            String miscStopPurpose, double miscStopTime) {
        this.baggage = baggage;
        this.date = date;
        this.notificationPreferences = notificationPreferences;
        this.flightInfo = new FlightInfo(flightNumber, sourceAirport, destinationAirport);
        this.user = user;
        this.miscStops = new MiscStops(miscStopPurpose, miscStopTime);
        this.source = location;
    }
    
    
    public FlightInfo getFlightInfo(){
        return this.flightInfo;
    }
    
    public int getBaggageInfo(){
        return this.baggage;
    }
    
    public String getItineraryDate(){
        return this.date;
    }
    
    public List<String> getNotificationPreferences() {
        return notificationPreferences;
    }
    
    public MiscStops getMiscStops() {
        return miscStops;
    }
}
