//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// Tässä tiedostossa tehtävät 3-5
//
import java.io.Console;

public class Ex36_03to05 {
    public static void main(String [] args) {
        // Tehtävä 3
        int age = 5;
        double number = 5.5;
        char someChar = 'a';

        System.out.println(age);
        System.out.println(number);
        System.out.println(someChar);


        // Tehtävä 4
        int toByte = 5;
        byte asByte;

        asByte = (byte) toByte;
        System.out.println(asByte);

        toByte = asByte;
        System.out.println(asByte);


        // Tehtävä 5
        Console c = System.console();

        System.out.println("Anna minulle kokonaisluku, jonka haluat jakaa");
        double number1 = Double.parseDouble(c.readLine());

        System.out.println("Anna minulle kokonaisluku, jolla jaetaan");
        double number2 = Double.parseDouble(c.readLine());

        System.out.println(number1 / number2);

    }
}
