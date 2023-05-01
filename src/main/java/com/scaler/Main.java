package com.scaler;
import com.scaler.greetings.Greetings;
import com.scaler.http.Client;
public class Main {
    public static void main(String[] args) {
        Greetings greet1 = new Greetings();
        System.out.println(greet1.greet());
        Client client = new Client();
        String response = client.get("https://square.github.io/okhttp/");
        System.out.println(response);
        System.out.println("Hello world from scaler!");
    }
}