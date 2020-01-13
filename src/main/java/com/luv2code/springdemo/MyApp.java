package com.luv2code.springdemo;

/**
 * @author t.danabekov
 * @since 17.11.2019
 */
public class MyApp {

    public static void main(String[] args) {

        //create the object
        Coach theCoach = new TrackCoach();

        //use the object
        System.out.println(theCoach.getDailyWorkout());
    }

}
