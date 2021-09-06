//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// Tässä tiedostossa tehtävä 2
//

import java.io.Console;

public class second {
    public static void main(String [] args) {
        Console c = System.console();
        System.out.println("Paljonko sinulla on rahaa?");
        int bal = Integer.parseInt(c.readLine());
        System.out.println("Mitä kellon tuntiviisari näyttää?");
        int hour = Integer.parseInt(c.readLine());


        if (bal > 300 && (hour >= 20 || hour <= 2)) {
            System.out.println("Nyt vois kyllä ottaa pari");
        } else {
            System.out.println("Ei nyt kyllä kannata lähteä pubiin");
        }
    }
}
