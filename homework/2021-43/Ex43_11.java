/**
 * Class Ex43_11 contains Robin exercise 11 from week 43
 * 
 * @author Juuso Korhonen {@literal <juuso.korhonen@bittivirta.fi>}
 */
public class Ex43_11 {
    
    /**
     * Prints 5 stars
     * 
     * @param args  Arguments for running the software
     */
    public static void main(String[] args) {
        printStars(5);
    }

    /**
     * Prints a single line of stars (*)
     * 
     * @param amount the number of stars
     */
    public static void printStars(int amount) {
        for (int i = 0; i<=amount; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
