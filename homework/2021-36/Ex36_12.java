//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// Tässä tiedostossa tehtävä 12
//
import java.io.Console;

public class Ex36_12 {
    public static void main(String [] args) {
        Console c = System.console();
        int number;

        System.out.println("Give a number between 0 and 60");
        number = Integer.parseInt(c.readLine());

        if (number > 60){
            System.out.println("Maximum point amount is 60.");
        } else if (number >= 53){
            System.out.println("The grade is laudatur.");
        } else if (number >= 45) {
            System.out.println("The grade is eximia.");
        } else if (number >= 36) {
            System.out.println("The grade is magna.");
        } else if (number >= 25) {
            System.out.println("The grade is cum laude.");
        } else if (number >= 17) {
            System.out.println("The grade is lubenter.");
        } else if (number >= 9) {
            System.out.println("The grade is approbatur.");
        } else if (number >= 0) {
            System.out.println("The grade is improbatur.");
        } else {
            System.out.println("Lowest point amount is 0.");
        }
    }
}
