/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airportontime.calculator;

import com.airportontime.external.MapStratergy;
import com.airportontime.generic.Location;

/**
 *
 * @author amitnandanp
 */
public class TrafficETACalculator extends DriverArrivalTimeCalculator {
    private Location source;
    private Location destination;
    private MapStratergy map;
    
    public TrafficETACalculator() {
        map = new MapStratergy();
    }

    public TrafficETACalculator(Location source, Location destination) {
        this.source = source;
        this.destination = destination;
        this.map = new MapStratergy();
    }
    
    public double getETA(){
        return map.getETA();
    }
}
