/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab5;

import java.util.ArrayList;

/**
 *
 * @author Seth
 */
public class City {
    private String name;
    private ArrayList<Road> roads;

    public City(String name, ArrayList<Road> roads) {
        this.name = name;
        this.roads = roads;
    }
    
    public void print(){
        System.out.printf("City Name: %s%n ", name);
        System.out.println("Roads:");
        for(Road road : roads){
            road.print();
        }
    }
}
