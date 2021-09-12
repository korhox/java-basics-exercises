//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// Tässä tiedostossa tehtävä 17
//
import java.io.Console;

public class ex2_17 {
    public static void main(String [] args) {

        Console c = System.console();
        String wideShapeMiddles = "";
        int lastShapeWidth = 0;

        System.out.println("How big shape you would like to have?");
        int size = Integer.parseInt(c.readLine());

        for (int i=size; i > 0; i--) {
            wideShapeMiddles = ""; // reset
            for (int i2=0; i2 < i; i2++) {
                wideShapeMiddles = wideShapeMiddles + " "; // spaces before middle square
                lastShapeWidth = wideShapeMiddles.length(); // shape width
            }
            wideShapeMiddles = wideShapeMiddles + "▅"; // middle square
            if (lastShapeWidth == 0) lastShapeWidth = 1; // prevent weird bug
            for (int i2=0; i2 < (double) size - lastShapeWidth - 2; i2++) {
                wideShapeMiddles = wideShapeMiddles + " "; // spaces before last square
            }

            System.out.println(wideShapeMiddles); // print middle bar
        }
    }
}