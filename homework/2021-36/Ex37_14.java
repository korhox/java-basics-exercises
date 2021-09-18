//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// Tässä tiedostossa tehtävä 14
//
import java.io.Console;

public class Ex37_14 {
    public static void main(String [] args) {

        Console c = System.console();
        String wideShape = "";

        System.out.println("How wide shape you would like to have?");
        double width = Double.parseDouble(c.readLine());

        System.out.println("How long shape you would like to have?");
        double length = Double.parseDouble(c.readLine());

        for (int i = 0; i < width; i++) {
            wideShape = wideShape + "▅ ";
        }

        for (int i = 0; i < length; i++) {
            System.out.println(wideShape);
        }
    }
}