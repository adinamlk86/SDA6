package exercitii;

import java.time.LocalTime;

//5. Write a Java program that prints the current time in GMT.
public class PrintCurrentTime {

    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time is: "+currentTime);
    }
}
