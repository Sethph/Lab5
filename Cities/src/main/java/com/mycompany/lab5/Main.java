/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab5;

import java.util.ArrayList;
import java.util.HashSet;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Seth
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        Path sPath = Paths.get("City");
        Charset cs = Charset.forName("UTF-8");
        List<String> lines = Files.readAllLines(sPath, cs);
        HashSet<City> cities = new HashSet<>();

        for (String line : lines) {
            String[] s = line.split(";");

            if (doesCityExist(cities, s[0])) {
                Road road = new Road(s[1], s[2]);
                addToCity(cities, road, s[0]);
                break;
            } else {
                City city = new City(s[0]);
                Road road = new Road(s[1], s[2]);
                city.addToCity(road);
                cities.add(city);

            }

        }

        try (PrintWriter out = new PrintWriter(new OutputStreamWriter(new FileOutputStream("cities.txt"), "UTF-8"))) {
            for (City city : cities) {
                city.write(out);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void addToCity(HashSet<City> cities, Road road, String cityName) {
        for (City city : cities) {
            if (city.getName().equals(cityName)) {
                city.addToCity(road);
            }
        }
    }

    public static boolean doesCityExist(HashSet<City> cities, String cityName) {
        for (City city : cities) {
            if (city.getName().equals(cityName)) {
                return true;
            }
        }
        return false;
    }
}
