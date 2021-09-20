//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// This file has exercise 10
//
import java.io.Console;
import java.util.ArrayList; 

class Ex38_10 {
    public static void main(String [] args) {
        Console c = System.console();

        ArrayList<String> names = new ArrayList<String>();
        String addedString;

        System.out.println("Please enter names, so many as you wish. Enter 'stop' to exit.");
        do {
            addedString = c.readLine();
            names.add(addedString);
        } while(!addedString.equalsIgnoreCase("stop"));

        System.out.println("The names you gave were:");
        for (int i=0; i<names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}