package com.example.test;

public class DogMain {
    public static void main(String[] args) {
        Labrador rover = new Labrador("Rover");
        Dog rover2 = new Dog("Rover");

        // returns true because labrador is a instance of dog
        System.out.println(rover2.equals(rover));

        // returns false because dog is not a instance of labrador
        // best way to fix this is not to override the equals method in labrador class
        // or to make the equals method in Dog class as final
        System.out.println(rover.equals(rover2));
    }
}
