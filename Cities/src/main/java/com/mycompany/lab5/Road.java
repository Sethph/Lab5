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
    private String name;
    private String destination;
    private double length;

    public Road(String name, String destination, double length) {
        this.name = name;
        this.destination = destination;
        this.length = length;
    }

    public void print() {
        System.out.printf("Name: %s, Destination: %s, Length: %f mi %n", name, destination, length);
    }
    
    
}
