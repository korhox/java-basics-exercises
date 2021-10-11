//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// This file has exercise 5
//
import java.io.Console;

public class Ex41_05 {
    public static void main(String[] args) {
        printTwoDimArray(askTwoDimArrayValues());
    }
    public static int[][] askTwoDimArrayValues() {
        int[][] table = new int[2][3];
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
        for (int i = 0; i < arr.length; i++) {
            int[] tmp = arr[i];
            for (int j = 0; j < tmp.length; j++) {
                System.out.print(tmp[j]);
            }
            System.out.println();
        }
    }


    public static final Console c = System.console();
}
