package exercitii;

//7. Write a Java program to takes the user for a distance (in meters) and the time was taken (
// as three numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour
// and miles per hour (hint: 1 mile = 1609 meters).

import java.util.Scanner;

public class CalculateSpeed {

    static float speedInMetersPerSecond(float distance, float seconds){

        return distance/seconds;
    }

    static double speedInKMPerHour(float distance, double hours){

        return (distance/hours)/1000;
    }

    static double speedInMilesPerHour(float distance, double hours){

        float distanceInMiles = distance/1609;
        return distanceInMiles/hours;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input distance in meters: ");
        int distance = input.nextInt();
        System.out.println("Input hour: ");
        int hour = input.nextInt();
        System.out.println("Input minutes: ");
        int minutes = input.nextInt();
        System.out.println("Input seconds: ");
        int seconds = input.nextInt();

        float timeInSeconds = hour*3600 + minutes*60 + seconds;
        double timeInHours = hour + minutes*0.0166667 + seconds*0.00027777;

        float speed1=speedInMetersPerSecond(distance,timeInSeconds);
        double speed2=speedInKMPerHour(distance,timeInHours);
        double speed3=speedInMilesPerHour(distance,timeInHours);
        System.out.println("Speed in meters/second: "+ speed1);
        System.out.println("Speed in km/hour: "+ (float)speed2);
        System.out.println("Speed in miles/hour: "+ (float)speed3);


    }

}
