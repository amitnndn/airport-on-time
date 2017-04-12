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
public class FlightAwareFacade implements ExternalAPIInterface {
    
    public double getData() {
//        TODO : Connect to FlightAware API here
        return 2.5;
    }
    
    public boolean isAvailable() {
//        TODO : Check if the API is available
        return true;
    }
    
}
