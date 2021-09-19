//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// Tässä tiedostossa tehtävä 9
//

import java.io.Console;

public class Ex37b_09 {
    public static void main(String[] args) {
        Console c = System.console();

        System.out.println("And your name is?");
        String name = c.readLine();
        String nameFiltered = "";
        String nameBackwards = "";

        // Loop through the name
        for (int i=0; i<name.length(); i++) {
            // Add characters to new string one by one
            if(name.charAt(i) != ' ' && name.charAt(i) != '.' && name.charAt(i) != ',') {
                nameFiltered = nameFiltered + name.charAt(i);
            }
        }

        // Loop backwards through number of letters in name
        for (int i=nameFiltered.length(); i>0; i--) {
            // Add characters to new string one by one
            nameBackwards = nameBackwards + nameFiltered.charAt(i-1);
        }

        if (nameFiltered.equalsIgnoreCase(nameBackwards)) {
            System.out.println("It is palindrome: " + nameFiltered);
        } else {
            System.out.println("It is not palindrome: " + nameFiltered);
        }
    }
}