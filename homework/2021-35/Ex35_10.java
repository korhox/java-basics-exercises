//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// Tässä tiedostossa tehtävä 10
//
import java.io.Console;  

public class Ex35_10 {
    public static void main(String [] args) {
        int number = 0;
        int result = 0;
        int biggest = 0;
        do {
            number = askNumber();
            if (number > 0) {
                System.out.println("Annoit positiivisen luvun " + number + ".");
                result = result + number;
                if (number > biggest) {
                    biggest = number;
                }
            } else {
                System.out.println("Annoit negatiivisen luvun " + number + ".");
            }
        } while (number > 0);
        
        System.out.println("Positiivisien lukujen summa: " + result + ". Suurin summa: " + biggest);
    }
    public static int askNumber() {
        Console c = System.console(); 
        System.out.println("Anna luku");
        return Integer.parseInt(c.readLine());
    }
}