/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Seth
 */
public class City {
    private String name;
    private List<Road> roads = new ArrayList();

    public City(String name,List<Road> roads) {
        this.name = name;
        this.roads = roads;
    }

    public City(String name) {
        this.name = name;
    }
    
    public void print(){
        System.out.printf("City Name: %s%n ", name);
        System.out.println("Roads:");
        for(Road road : roads){
            road.print();
        }
        System.out.println("");
    }

    public String getName() {
        return name;
    }

    public List<Road> getRoads() {
        return roads;
    }
    
    public void addToCity(Road road){
        roads.add(road);
    }
    
}
