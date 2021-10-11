//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// This file has exercise 12
//
import java.io.Console;

public class Ex41_12 {
    public static int arenaSize = 0;
    public static int [] playerLocation = {0, 0};
    public static int score = 0;
    public static int [][] apples;

    public static void main(String[] args) {
        clearScreen();
        arenaSize = askInt(CYAN_BOLD + "Enter the size of game arena: " + GREEN + "[10-100] (rounded to nearest odd number)" + RESET) + 1;
        arenaSize = (arenaSize % 2 == 0) ? arenaSize+1 : arenaSize;
        playerLocation[0] = arenaSize / 2;
        playerLocation[1] = arenaSize / 2;

        reGenerateApples();

        printPlayArea();
        printStats();
        while (movePlayer()) {
            printPlayArea();
            printStats();
        }
    }

    public static boolean movePlayer() {
        boolean waitForCorrectInput = true;
        do {
            String movement = askString(CYAN_BOLD + "Which way would you like to move? " + GREEN + "[WASD, 8624]");
            boolean UP = (movement.equalsIgnoreCase("W") || movement.equalsIgnoreCase("8"));
            boolean DOWN = (movement.equalsIgnoreCase("S") || movement.equalsIgnoreCase("2"));
            boolean RIGHT = (movement.equalsIgnoreCase("D") || movement.equalsIgnoreCase("6"));
            boolean LEFT = (movement.equalsIgnoreCase("A") || movement.equalsIgnoreCase("4"));
            if (UP) {
                playerLocation[1]--;
                waitForCorrectInput = false;
                return true;
            } else if (DOWN) {
                playerLocation[1]++;
                waitForCorrectInput = false;
                return true;
            } else if (RIGHT) {
                playerLocation[0]++;
                waitForCorrectInput = false;
                return true;
            } else if (LEFT) {
                playerLocation[0]--;
                waitForCorrectInput = false;
                return true;
            }
        } while (waitForCorrectInput);
        return false;
    }

    public static void printPlayArea() {
        String [][] resultTable = new String[arenaSize][arenaSize];
        for (int l = 0; l < arenaSize; l++) {
            for (int w = 0; w < arenaSize; w++) {
                Boolean borders =   (w == 0 || w == arenaSize - 1) ||
                                    (l == 0 || l == arenaSize - 1);

                Boolean player =    (w == playerLocation[0]) &&
                                    (l == playerLocation[1]);

                if (borders) {
                    resultTable[l][w] = BLUE + "■ " + RESET;
                } else if (player) {
                    resultTable[l][w] = WHITE + "■ " + RESET;
                } else {
                    resultTable[l][w] = BLACK + "+ " + RESET;
                }
            }
        }

        printTwoDimArray(resultTable);
    }

    public static void reGenerateApples() {
        for (int i = 0; i < 2; i++) {
            boolean disallowedPoints;
            int [] location = {0,0};
            int retries = 1;
            do {
                location[0] = (int) Math.random() * arenaSize;
                location[1] = (int) Math.random() * arenaSize;
                disallowedPoints =  (location[0] == 0) ||
                                    (location[0] == arenaSize) ||
                                    (location[1] == 0) ||
                                    (location[1] == arenaSize) ||
                                    (location[0] == playerLocation[0]) ||
                                    (location[1] == playerLocation[1]);
                if (disallowedPoints) {
                    System.out.println(RED + "["+retries+"] Retrying to regenerate apples..." + RESET);
                    retries++;
                }
            } while (disallowedPoints && retries <= 10);
            apples[i] = location;
        }
    }

    public static void printStats() {
        System.out.println(GREEN_BOLD + "■ " + GREEN_BOLD + score + RESET);
    }

    public static Integer askInt(String message) {
        System.out.println(message);
        return Integer.parseInt(c.readLine());
    }
    
    public static String askString(String message) {
        System.out.println(message);
        return c.readLine();
    }

    public static void printTwoDimArray(String[][] arr) {
        clearScreen();
        for (int i = 0; i < arr.length; i++) {
            String[] tmp = arr[i];
            for (int j = 0; j < tmp.length; j++) {
                System.out.print(tmp[j]);
            }
            System.out.println();
        }
    }

    // Clear screen
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // Console
    public static final Console c = System.console();

    // Colors
    public static final String RESET = "\033[0m";  // Text Reset
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE
    public static final String BLACK_BOLD = "\033[1;30m";  // BOLD BLACK
    public static final String RED_BOLD = "\033[1;31m";    // BOLD  RED
    public static final String GREEN_BOLD = "\033[1;32m";  // BOLD  GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // BOLD  YELLOW
    public static final String BLUE_BOLD = "\033[1;34m";   // BOLD  BLUE
    public static final String PURPLE_BOLD = "\033[1;35m"; // BOLD  PURPLE
    public static final String CYAN_BOLD = "\033[1;36m";   // BOLD  CYAN
    public static final String WHITE_BOLD = "\033[1;37m";  // BOLD  WHITE
}
