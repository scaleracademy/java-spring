package com.scaler.greetings;

public class Greetings {
    /**
     * write a function which prints the appropriate greeting message based on the time of dayt eday
     */
    public String greet() {
        int hour = java.time.LocalTime.now().getHour();
        if(hour >= 0 && hour < 12) {
            return "Good morning!";
        } else if(hour >= 12 && hour < 16) {
           return "Good afternoon!";
        } else if(hour >= 16 && hour < 20) {
            return "Good evening!";
        } else {
           return "Good night!";
        }
    }
}
