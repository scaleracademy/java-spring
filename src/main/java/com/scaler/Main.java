package com.scaler;
import com.scaler.greetings.Greetings;
import com.scaler.http.Client;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Argument passed is: " + Arrays.toString(args));


        switch (args[0]) {
            case "greet":
                Greetings greet = new Greetings();
                System.out.println(greet.greet());
                break;
            case "http":
                Client client = new Client();
                String response = client.get("https://square.github.io/okhttp/");
                System.out.println(response);
                break;
            default:
                System.out.println("Invalid argument passed");
        }

    }
//
//        Greetings greet1 = new Greetings();
//        System.out.println(greet1.greet());
//        Client client = new Client();
//        String response = client.get("https://square.github.io/okhttp/");
////        System.out.println(response);
//        System.out.println("Hello world from scaler!");
//    }
}