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
public class MiscStops {
    private String purpose; 
    private double time; 

    public MiscStops(String purpose, Double time) {
        this.purpose = purpose;
        this.time = time;
    }

    public double getTime() {
        return time;
    }
    
}
