package com.example.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    private static Map<String,HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
	// write your code here
        HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp = new HeavenlyBody("Pluto", 225);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp = new HeavenlyBody("Earth", 365);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new HeavenlyBody("Moon",27);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);

        System.out.println("Planets are: ");
        for (HeavenlyBody planet:planets){
            System.out.println("\t"+planet.getName());
        }

        HeavenlyBody pluto = new HeavenlyBody("Pluto",842);
        planets.add(pluto);
        for (HeavenlyBody planet: planets){
            System.out.println(planet.getName()+": "+planet.getOrbitalPeriod());
        }

        Object o = new Object();
        "pluto".equals(o);

    }
}
