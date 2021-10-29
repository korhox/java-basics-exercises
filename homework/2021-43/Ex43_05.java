/**
 * Robin exercise 05 from week 43
 * 
 * @author Juuso Korhonen <juuso.m.korhonen@tuni.fi>
 */
import java.io.Console;

public class Ex43_05 {
    public static void main(String[] args) {
        Console c = System.console();
        String nimi = "";

        do{
            System.out.println("Anna nimi jossa vähintään kaksi kirjainta");
            nimi = c.readLine();
        } while(nimi.length() < 2);

        System.out.print("annoit nimen " + nimi);
    }
}
