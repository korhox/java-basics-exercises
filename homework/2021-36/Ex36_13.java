//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// Tässä tiedostossa tehtävä 13
//
import java.io.Console;

public class Ex36_13 {
    public static void main(String [] args) {

        Console c = System.console();
        String shape = "";

        System.out.println("How wide shape you would like to have?");
        double number = Double.parseDouble(c.readLine());

        for (int i = 0; i < number; i++) {
            shape = shape + "▅ ";
        }

        System.out.println(shape);
    }
}
