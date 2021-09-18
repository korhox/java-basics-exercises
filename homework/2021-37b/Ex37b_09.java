//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// Tässä tiedostossa tehtävä 8
//

import java.io.Console;
import java.nio.ShortBuffer;

import javax.print.attribute.standard.PrinterName;

public class Ex37b_09 {
    public static void main(String[] args) {
        Console c = System.console();

        System.out.println("And your name is?");
        String name = c.readLine();
        String nameBackwards = "";

        // Loop backwards through number of letters in name
        for (int i=name.length(); i>0; i--) {
            // Add characters to new string one by one
            if(name.charAt(i-1) == '.') {
                
            }
            nameBackwards = nameBackwards + name.charAt(i-1);
        }

        if (name.equalsIgnoreCase(nameBackwards)) {
            System.out.println("It is palindrome");
        } else {
            System.out.println("It is not palindrome");
        }
    }
}