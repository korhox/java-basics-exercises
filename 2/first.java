//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// Tässä tiedostossa tehtävä 1
//

import java.io.Console;

public class first {
    public static void main(String [] args) {
        Console c = System.console();
        System.out.println("Anna päivä");
        int day = Integer.parseInt(c.readLine());
        System.out.println("Anna kuukausi");
        int month = Integer.parseInt(c.readLine());

        if (day == 24 && month == 12) {
            system.out.println("Hyvää joulua!");
        } else {
            system.out.println("Hyvää päivää!");
        }
    }
}