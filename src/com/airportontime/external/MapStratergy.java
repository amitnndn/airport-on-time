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
public class MapStratergy {
    private MapInterface map;
    
    public double getETA(){
        map = this.returnAPI();
        return map.getData();
    }
    
    public MapInterface returnAPI(){
        GoogleMapsFacade googleMaps = new GoogleMapsFacade(new Location(2.5,5.2), new Location(2.5,5.2));
        WazeMapsFacade wazeMaps = new WazeMapsFacade(new Location(2.5,5.2), new Location(2.5,5.2));
        if(googleMaps.isAvailable()){
            return googleMaps;
        }
        else {
            return wazeMaps;
        }
    }
}
