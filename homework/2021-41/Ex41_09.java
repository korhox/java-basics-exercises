//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// This file has exercise 9
//
import java.io.Console;

public class Ex41_09 {
    public static void main(String[] args) {
        System.out.println("How wide square do you want?");
        int width = Integer.parseInt(c.readLine());
        System.out.println("How long square do you want?");
        int length = Integer.parseInt(c.readLine());

        String [][] resultTable = new String[length][width];
        for (int l = 0; l < length; l++) {
            for (int w = 0; w < width; w++) {
                Boolean condition = (w == 0 || w == width - 1) ||
                                    (w == l);
                if (condition) {
                    resultTable[l][w] = "■ ";
                } else {
                    resultTable[l][w] = "  ";
                }
            }
        }

        printTwoDimArray(resultTable);

    }
    public static void printTwoDimArray(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            String[] tmp = arr[i];
            for (int j = 0; j < tmp.length; j++) {
                System.out.print(tmp[j]);
            }
            System.out.println();
        }
    }

    public static final Console c = System.console();
}
