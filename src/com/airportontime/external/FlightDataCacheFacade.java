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
public class FlightDataCacheFacade implements ExternalAPIInterface {

    @Override
    public double getData() {
        return 2.5;
    }

    @Override
    public boolean isAvailable() {
        return true;
    }            
}
