//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// Tässä tiedostossa tehtävä 2
//

public class Ex02 {
    public static void main(String[] args) {

        String text = "This is an test string.";

        System.out.println(text); // print whole string
        
        System.out.println(text.charAt(5)); // print only fiveth character, its an I

        System.out.print(text.length()); // print the length on the string, its 23 characters long
        System.out.println(); // print line change

        text = "      This is an test string.           "; // add spaces to string

        System.out.println(text.trim()); // removes leading and tailing spaces
    }
}