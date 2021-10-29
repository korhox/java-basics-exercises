/**
 * Robin exercise 08 from week 43
 * 
 * @author Juuso Korhonen <juuso.m.korhonen@tuni.fi>
 */
import java.io.Console;

public class Ex43_08 {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.println("Anna positiivisia numeroita. Lopeta antamalla negatiivinen.");
        
        int input = 0;
        int sum = 0;
        int inputs = 0;

        do {
            input = Integer.parseInt(c.readLine());
            if (input > 0) {
                sum = sum + input;
                inputs++;
            }
        } while(input > 0);

        int result = sum / inputs;

        System.out.println("Result = " + result);

    }
}
