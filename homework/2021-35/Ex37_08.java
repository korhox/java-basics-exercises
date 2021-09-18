//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// Tässä tiedostossa tehtävä 8
//

import java.io.Console;  

public class Ex37_08 {
    public static void main(String [] args) {
        Console c = System.console(); 

        System.out.println("Anna ikäsi");
        int age = Integer.parseInt(c.readLine());
        if (age > 25) {
            System.out.println("Oletpas vanha!"); // rude
        } else {
            System.out.println("Oletpas nuori!");
        }

    }
}