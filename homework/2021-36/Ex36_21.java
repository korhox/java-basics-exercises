//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// Tässä tiedostossa tehtävä 21
//
import java.io.Console;
import java.util.Random;

public class Ex36_21 {
    public static void main(String [] args) {
        Console c = System.console();
        int round = 0;
        int ties = 0;
        int points1 = 0;
        int points2 = 0;
        do {
            round++;
            int player1 = 0;
            do {
                clearScreen();
                System.out.println(WHITE_BOLD+"ROCK PAPER SCISSORS ROUND #"+round+RESET);
                if (points1 > 0 || points2 > 0) {
                    System.out.println(WHITE+"You: "+RED+points1+RESET);
                    System.out.println(WHITE+"Computer: "+GREEN+points2+RESET);
                }
                System.out.println();
                System.out.println("Please enter "+RED_BOLD+"your"+RESET+" response:");
                System.out.println("[1] " + name(0));
                System.out.println("[2] " + name(1));
                System.out.println("[3] " + name(2));
                System.out.println("[4] " + name(3));
                System.out.println("[5] " + name(4));
                player1 = Integer.parseInt(c.readLine()) - 1;
            } while (player1 < 0 || player1 > 4);

            Random player2rnd = new Random();

            int player2 = player2rnd.nextInt(5);

            clearScreen();
            System.out.println(WHITE_BOLD+"ROCK PAPER SCISSORS ROUND #"+round+RESET);

            System.out.println();
            System.out.println(RED_BOLD +"You "+RESET+"gave " + name(player1) + " and "+GREEN_BOLD+"Computer "+RESET+"gave " + name(player2) + ".");
            System.out.println();

            boolean player1loses = ((player1 - player2) % 5 < 3);

            if (player1 == player2) {
                System.out.println(WHITE_BOLD+"It's a tie! No points were given!");
                ties++;
            } else if (player1loses) {
                System.out.println(GREEN_BOLD+"Computer wins this round!"+RESET);
                points2++;
            } else {
                System.out.println(RED_BOLD+"You win this round!"+RESET);
                points1++;
            }
            System.out.println();
            System.out.println(WHITE_BOLD+"Press enter to continue");
            c.readLine();
        } while (points1 < 3 && points2 < 3);
        
        if (points1 >= 3) {
            clearScreen();
            System.out.println(WHITE_BOLD+"ROCK PAPER SCISSORS"+RESET);
            System.out.println();
            System.out.println(RED_BOLD+"You won the game with "+points1+"/"+points2+" points!"+RESET);
            System.out.println("There were " + WHITE_BOLD + ties + RESET + " ties during the game and the game lasted "+ WHITE_BOLD + round + RESET + " rounds.");
            System.out.println();
            System.out.println(WHITE_BOLD+"Press enter to continue");
            c.readLine();
        }
        if (points2 >= 3) {
            clearScreen();
            System.out.println(WHITE_BOLD+"ROCK PAPER SCISSORS"+RESET);
            System.out.println();
            System.out.println(GREEN_BOLD+"Computer won the game with "+points1+"/"+points2+" points!"+RESET);
            System.out.println("There were " + WHITE_BOLD + ties + RESET + " ties during the game and the game lasted "+ WHITE_BOLD + round + RESET + " rounds.");
            System.out.println();
            System.out.println(WHITE_BOLD+"Press enter to continue");
            c.readLine();
        }

    }
    static String name(int x) {
        switch(x) {
            case 0:
                return WHITE_BOLD+"Rock"+RESET;
            case 1:
                return WHITE_BOLD+"Spock"+RESET;
            case 2:
                return WHITE_BOLD+"Paper"+RESET;
            case 3:
                return WHITE_BOLD+"Lizard"+RESET;
            case 4:
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