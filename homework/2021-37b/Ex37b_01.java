//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// Tässä tiedostossa tehtävä 1
//

import java.io.Console;
public class Ex37b_01 {
    public static void main(String[] args) {
        Console c = System.console();

        System.out.println("And your name is?");
        String name = c.readLine();

        if (name.toLowerCase().equals("jussi")) {
            System.out.println("What a stupid name.");
        } else {
            System.out.println("You have a beautiful name!");
        }
    }
}