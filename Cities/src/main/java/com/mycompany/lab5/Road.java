/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab5;

/**
 *
 * @author Seth
 */
public class Road {
    private String destination;
    private String length;

    public Road(String destination, String length) {
        this.destination = destination;
        this.length = length;
    }

    public void print() {
        System.out.printf("    Destination: %s, Length: %s mi %n",destination, length);
    }

    public String getDestination() {
        return destination;
    }

    public String getLength() {
        return length;
    }
    
    
}
