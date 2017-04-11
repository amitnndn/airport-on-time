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
public class User {
    private String eMail; 
    private String phone;
    private String fname;
    private String lname;

    public User(String eMail, String phone, String fname, String lname) {
        this.eMail = eMail;
        this.phone = phone;
        this.fname = fname;
        this.lname = lname;
    }

    public String geteMail() {
        return eMail;
    }

    public String getPhone() {
        return phone;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }
}
