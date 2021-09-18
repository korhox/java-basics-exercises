//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// Tässä tiedostossa tehtävät 10 - 11
//

import java.io.Console;

public class Ex36_10to11 {
    public static void main(String [] args) {
        Console c = System.console();
        int number;
        do {
            System.out.println("Give a number between 1 and 7");
            number = Integer.parseInt(c.readLine());

        } while (number < 1 || number > 7);
        switch (number) {
            case 1:
                System.out.println("It's monday");
                break;
            case 2:
                System.out.println("It's tuesday");
                break;
            case 3:
                System.out.println("It's wednesday");
                break;
            case 4:
                System.out.println("It's thursday");
                break;
            case 5:
                System.out.println("It's friday");
                break;
            case 6:
                System.out.println("It's saturday");
                break;
            case 7:
                System.out.println("It's sunday");
                break;
            default:
                System.out.println("And how's this possible?");
        }
    }
}
