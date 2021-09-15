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
public class Main {
    public static void main(String[] args) {
        Road frey = new Road("Frey","Stephenville",2.2);
        ArrayList roads = new ArrayList<Road>();
        roads.add(frey);
        City stephenville = new City("Stephenville",roads);
    }
}
