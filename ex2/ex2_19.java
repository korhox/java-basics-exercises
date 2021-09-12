//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// Tässä tiedostossa tehtävä 19
//
import java.io.Console;

public class ex2_19 {
    public static void main(String [] args) {
        Console c = System.console();
        int player1 = 0;
        int player2 = 0;

        do {
            clearScreen();
            System.out.println(WHITE_BOLD+"ROCK PAPER SCISSORS"+RESET);
            System.out.println();
            System.out.println("Please enter "+RED_BOLD+"Player 1 "+RESET+"response:");
            System.out.println("[1] " + name(0));
            System.out.println("[2] " + name(1));
            System.out.println("[3] " + name(2));
            player1 = Integer.parseInt(c.readLine()) - 1;
        } while (player1 < 0 || player1 > 2);

        do {
            clearScreen();
            System.out.println(WHITE_BOLD+"ROCK PAPER SCISSORS"+RESET);
            System.out.println();
            System.out.println("Please enter "+GREEN_BOLD+"Player 1 "+RESET+"response:");
            System.out.println("[1] " + name(0));
            System.out.println("[2] " + name(1));
            System.out.println("[3] " + name(2));
            player2 = Integer.parseInt(c.readLine()) - 1;
        } while (player2 < 0 || player2 > 2);

        clearScreen();
        System.out.println(WHITE_BOLD+"ROCK PAPER SCISSORS"+RESET);
        System.out.println();
        System.out.println(RED_BOLD +"Player 1 "+RESET+"gave " + name(player1) + " and "+GREEN_BOLD+"Player 2 "+RESET+"gave " + name(player2) + ".");
        System.out.println();

        boolean player1loses =  ((player1 == 0 && player2 == 1)||
                                (player1 == 1 && player2 == 2)||
                                (player1 == 2 && player2 == 0));

        if (player1 == player2) {
            System.out.println(WHITE_BOLD+"It's a tie!");
        } else if (player1loses) {
            System.out.println(GREEN_BOLD+"Player 2 wins!"+RESET);
        } else {
            System.out.println(RED_BOLD+"Player 1 wins!"+RESET);
        }

    }
    static String name(int x) {
        switch(x) {
            case 0:
                return WHITE_BOLD+"Rock"+RESET;
            case 1:
                return WHITE_BOLD+"Paper"+RESET;
            case 2:
                return WHITE_BOLD+"Scissors"+RESET;
            default:
                return "n/a";
        }
    }



    // not related to exercise

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    public static final String RESET = "\033[0m";  // Text Reset

    // Regular Colors
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE

    // Bold
    public static final String BLACK_BOLD = "\033[1;30m";  // BLACK
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
    public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    public static final String CYAN_BOLD = "\033[1;36m";   // CYAN
    public static final String WHITE_BOLD = "\033[1;37m";  // WHITE


}