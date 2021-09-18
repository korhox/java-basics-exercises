//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// Tässä tiedostossa tehtävä 8
//

import java.io.Console;
public class Ex37b_08 {
    public static void main(String[] args) {
        Console c = System.console();

        System.out.println("And your name is?");
        String name = c.readLine();
        String nameLower = name.toLowerCase(); // lower the capitalized letters in order to not to fall on different letter capitalization
        String nameBackwards = "";

        // Loop backwards through number of letters in name
        for (int i=name.length(); i>0; i--) {
            // Add characters to new string one by one
            nameBackwards = nameBackwards + nameLower.charAt(i-1);
        }

        // Compare original string (lowered case) and new string (lowered case)
        if (nameLower.equals(nameBackwards)) {
            System.out.println("It is palindrome");
        } else {
            System.out.println("It is not palindrome");
        }
    }
}