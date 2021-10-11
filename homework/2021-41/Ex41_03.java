//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// This file has exercise 3
//

public class Ex41_03 {
    public static void main(String[] args) {
        int [][] table = {{1,3,9}, {2,7,3}};
        for (int i = 0; i < table.length; i++) {
            int[] tmp = table[i];
            for (int j = 0; j < tmp.length; j++) {
                System.out.print(tmp[j]);
            }
            System.out.println();
        }
    }
}
