/**
 * Robin exercise 07 from week 43
 * 
 * @author Juuso Korhonen <juuso.m.korhonen@tuni.fi>
 */
import java.io.Console;

public class Ex43_07 {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.println("Give the number");
        int number = Integer.parseInt(c.readLine());
        int result = 0;
        for(int i=0; i<=number; i++) {
            result += i;
        }
        System.out.println(result);
    }
}
