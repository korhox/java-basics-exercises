import java.io.Console;

/**
 * Class Ex43_16 contains Robin exercise 16 from week 43
 * 
 * @author Juuso Korhonen {@literal <juuso.korhonen@bittivirta.fi>}
 */
public class Ex43_16 {
    public static void main(String[] args) {
        Console c = System.console();

        System.out.println("How big table would you like to have?");
        int size = Integer.parseInt(c.readLine());

        int [] table = new int[size];

        for (int i=0; i<=table.length-1; i++) {
            System.out.println("Enter value for table item #" + (i+1) + " of " + table.length);
            table[i] = Integer.parseInt(c.readLine());
        }

        double result = 0;

        for (int i=0; i<=table.length-1; i++) {
            result += table[i];
        }
        result = result / table.length;

        System.out.println("The average of these values is: " + result);
    }
}
