//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// This file has exercise 6
//
import java.io.Console;

public class Ex41_07 {
    public static void main(String[] args) {
        printTwoDimArray(askTwoDimArrayValues());
    }
    public static int[][] askTwoDimArrayValues() {
        System.out.println("How many columns you want?");
        int width = Integer.parseInt(c.readLine());
        System.out.println("How many rows you want?");
        int height = Integer.parseInt(c.readLine());
        int[][] table = new int[width][height];
        for (int i = 0; i < table.length; i++) {
            int[] tmp = table[i];
            for (int j = 0; j < tmp.length; j++) {
                System.out.println("Give value for " + i + " of " + j + ":");
                tmp[j] = Integer.parseInt(c.readLine());
            }
        }
        return table;
    }
    public static void printTwoDimArray(int[][] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int[] tmp = arr[i];
            for (int j = 0; j < tmp.length; j++) {
                System.out.print(tmp[j]);
                if (tmp[j] > max) {
                    max = tmp[j];
                }
            }
            System.out.println();
        }
        System.out.println("Max: " + max);
    }


    public static final Console c = System.console();
}
