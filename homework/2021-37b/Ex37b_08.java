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
        String nameLower = name.toLowerCase();
        String nameBackwards = "";

        for (int i=name.length(); i>0; i--) {
            nameBackwards = nameBackwards + nameLower.charAt(i-1);
        }

        if (nameLower.equals(nameBackwards)) {
            System.out.println("It is palindrome");
        } else {
            System.out.println("It is not palindrome");
        }
    }
}