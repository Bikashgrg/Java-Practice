package com.example.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i=1;i<=100;i++){
            squares.add(i*i);
            cubes.add(i*i*i);
        }

        System.out.println("There are "+squares.size()+" squares and "+cubes.size()+" cubes.");
        Set<Integer> union = new HashSet<>(squares);
        // this will contain union of 196 values, and not 200.
        union.addAll(cubes);
        System.out.println("Union contains "+union.size()+" elements.");

        Set<Integer> intersection = new HashSet<>(squares);
        // this will contain 4 intersection elements
        intersection.retainAll(cubes);
        System.out.println("Intersection contains "+intersection.size()+" elements.");
        // this will show all those values that are intersecting
        for (int i:intersection){
            System.out.println(i+" is the square of "+Math.sqrt(i)+" and cube of "+Math.cbrt(i));
        }

        Set<String> words = new HashSet<>();
        String sentence = "one day in the year of the fox";
        String[] arrayWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords));
        for (String s:words){
            System.out.println(s);
        }

        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();
        String[] natureWords = {"all","nature","is","but","art","unknown","to","thee"};
        String[] divineWords = {"to","err","is","human","to","forgive","divine"};

        nature.addAll(Arrays.asList(natureWords));
        divine.addAll(Arrays.asList(divineWords));

        // Asymmetric set example begins
        System.out.println("nature - divine");
        Set<String> diff1 = new HashSet<>(nature);
        // removes divine value and also those values that are common
        diff1.removeAll(divine);
        printSet(diff1);

        System.out.println("divine - nature");
        Set<String> diff2 = new HashSet<>(divine);
        // removes nature value and also that values that are common
        diff2.removeAll(nature);
        printSet(diff2);

    }
    private static void printSet(Set<String> set){
        System.out.print("\t");
        for (String s : set){
            System.out.print(s+" ");
        }
        System.out.println();
    }
}
