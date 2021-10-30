import java.io.Console;

/**
 * Class Ex43_10 contains Robin exercise 10 from week 43
 * 
 * @author Juuso Korhonen {@literal <juuso.korhonen@bittivirta.fi>}
 */
public class Ex43_10 {
    
    /**
     * The main method asks the user how many names they would like to see and
     * then prints the names using printText() method.
     * 
     * @param args  Arguments for running the software
     */
    public static void main(String[] args) {
        Console c = System.console();

        System.out.println("How many names would you like to have?");
        int number = Integer.parseInt(c.readLine());

        int i = 0;
        while(i < number) {
            printText();
            i++;
        }
    }

    /**
     * Method printText prints my name
     */
    public static void printText() {
        System.out.println("Juuso");
    }
}
