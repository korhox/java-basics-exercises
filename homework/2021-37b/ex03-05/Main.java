//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// Tässä tiedostossa tehtävät 3 - 5
//

import java.io.Console;
public class Main {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.println("And your name is?");
        String name = c.readLine();

        // Tehtävä 3
        System.out.println("#####");
        for(int i=0; i<name.length(); i++) {
            System.out.println(name.charAt(i));
        }

        // Tehtävä 4
        System.out.println("#####");
        for(int i=name.length(); i>0; i--) {
            System.out.println(name.charAt(i-1));
        }

        // Tehtävä 5
        System.out.println("#####");
        for(int i=0; i<name.length(); i++) {
            if (i%2==1) {
                System.out.println(name.charAt(i));
            }
        }
    }
}