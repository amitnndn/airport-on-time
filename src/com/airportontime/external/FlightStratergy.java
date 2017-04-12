/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airportontime.external;

/**
 *
 * @author amitnandanp
 */
public class FlightStratergy {
    private ExternalAPIInterface flightAPI;
    
    public double getETA() {
        flightAPI = this.returnAPI();
        return flightAPI.getData();
    }
    
    public ExternalAPIInterface returnAPI(){
        FlightAwareFacade flightAware = new FlightAwareFacade();
        FlightDataCacheFacade cacheFlightData = new FlightDataCacheFacade();
        if(flightAware.isAvailable()){
            return flightAware;
        }
        return cacheFlightData;
    }
    
}
