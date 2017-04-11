/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airportontime.external;

import com.airportontime.generic.Location;

/**
 *
 * @author amitnandanp
 */
public class GoogleMapsFacade implements MapInterface {
    
    private Location source;
    private Location destination; 

    public GoogleMapsFacade(Location source, Location destination) {
        this.source = source;
        this.destination = destination;
    }

    @Override
    public double getData() {
        return 2.5;
    }

    @Override
    public boolean isAvailable() {
//        TODO: Logic to check if API is available
        return true;
    }
}
