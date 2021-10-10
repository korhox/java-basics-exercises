import java.io.Console;

//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// This file has exercise 10
//

class Ex40_10 {
    public static int balance = 25;

    // Generate first table
    public static int[][] resultTable = {
        {randomNo(4), randomNo(4), randomNo(4)},
        {randomNo(4), randomNo(4), randomNo(4)},
        {randomNo(4), randomNo(4), randomNo(4)}
    };

    public static void main(String [] args) {
        printUI();
        String playNewGame = "";
        do {
            printUI();
            System.out.println(CYAN + "Play game? " + WHITE + "(hit enter)");
            playNewGame = c.readLine();
            if (playNewGame.equals("")) {
                playGame();
            }
        } while (playNewGame.equals(""));
    }

    public static void playGame() {
        clearScreen();
        balance--;
        for (int i = 0; i < 10; i++) {
            resultTable[1][0] = resultTable[0][0];
            resultTable[1][1] = resultTable[0][1];
            resultTable[1][2] = resultTable[0][2];
    
            resultTable[2][0] = resultTable[1][0];
            resultTable[2][1] = resultTable[1][1];
            resultTable[2][2] = resultTable[1][2];
    
            resultTable[0][0] = randomNo(4);
            resultTable[0][1] = randomNo(4);
            resultTable[0][2] = randomNo(4);

            printUI();
            System.out.println(WHITE + "(you pulled the lever...)");

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("An error happened during the game.");
            }
        }

        if (resultTable[1][0] == resultTable[1][1] && resultTable[1][1] == resultTable[1][2]) {
            printUI();
            System.out.println(PURPLE_BOLD + "YOU WON THE GAME! 🎉🎉🎉");
            balance += 3;

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("An error happened during the game.");
            }
        }

    }
    public static void printUI() {
        clearScreen();

        System.out.println();
        System.out.println(RED_BOLD + "    JAVASLOTS - CLI EDITION" + RESET);
        System.out.println(RED_BOLD + "    ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■" + RESET);
        System.out.println(RED_BOLD + "   ■                       ■" + RESET);
        System.out.println(RED_BOLD + "   ■     " + WHITE_BOLD + noToFruit(resultTable[0][0]) + "   " + noToFruit(resultTable[0][1]) + "   " +  noToFruit(resultTable[0][2]) + "      " + RED_BOLD + "■");
        System.out.println(RED_BOLD + "   ■ " + WHITE + "  » " + WHITE_BOLD + noToFruit(resultTable[1][0]) + WHITE + " – " + noToFruit(resultTable[1][1]) + WHITE + " – " +  noToFruit(resultTable[1][2]) + WHITE + " «    " + RED_BOLD + "■");
        System.out.println(RED_BOLD + "   ■     " + WHITE_BOLD + noToFruit(resultTable[2][0]) + "   " + noToFruit(resultTable[2][1]) + "   " +  noToFruit(resultTable[2][2]) + "      " + RED_BOLD + "■");
        System.out.println(RED_BOLD + "   ■                       ■" + RESET);
        System.out.println(RED_BOLD + "    ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■" + RESET);
        System.out.println();
        System.out.println(GREEN_BOLD + "     Balance: " + BLUE_BOLD + balance + RESET);
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public static Integer randomNo(int max) {
        return (int) (Math.random() * max);
    }

    public static String noToFruit(int index) {
        String [] fruits = new String[4];
        int fruitIndex = 0;
        fruits[fruitIndex++] = "🍆";
        fruits[fruitIndex++] = "🍉";
        fruits[fruitIndex++] = "🍑";
        fruits[fruitIndex++] = "🍌";

        return fruits[index];
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
