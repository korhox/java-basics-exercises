/**
 * Class Ex43_12 contains Robin exercise 12 from week 43
 * 
 * @author Juuso Korhonen {@literal <juuso.korhonen@bittivirta.fi>}
 */
public class Ex43_12 {
    
    /**
     * Prints an 5 by 5 rectangle of stars
     * 
     * @param args  Arguments for running the software
     */
    public static void main(String[] args) {
        printRectangle(5, 5);
    }

    /**
     * Prints a single line of stars (*)
     * 
     * @param amount the number of stars
     */
    public static void printStars(int amount) {
        for (int i = 0; i<=amount; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    /**
     * Prints an rectangle of stars based on width and height
     * 
     * @param width     width of the rectangle being printed
     * @param height     height of the rectangle being printed
     */
    public static void printRectangle(int width, int height) {
        for (int i = 0; i<=height; i++) {
            printStars(width);
        }
    }
}
