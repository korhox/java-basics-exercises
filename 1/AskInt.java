//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// Tässä tiedostossa tehtävät 5, 6 & 7
//

import java.io.Console;  

public class AskInt {
    public static void main(String [] args) {
        Console c = System.console(); 

        System.out.println("Anna luku A");
        int a = Integer.parseInt(c.readLine());
        System.out.println("Annoit luvun " + a + ".");

        System.out.println("Anna luku B");
        int b = Integer.parseInt(c.readLine());
        System.out.println("Annoit luvun " + b + ".");

        // Tehtävät 5 & 7
        if (a > b) {
            System.out.println("Hellurei, luku A=" + a + " on suurempi kuin B=" + b + ".");
        } else {
            System.out.println("Hellurei, luku B=" + b + " on suurempi kuin a=" + a + ".");
        }

        // Tehtävä 6
        System.out.println("Lukuken summahan on " + (a+b) + ".");

    }
}