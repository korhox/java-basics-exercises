/**
 * Class Ex43_20 contains Robin exercise 20 from week 43
 * 
 * @author Juuso Korhonen {@literal <juuso.korhonen@bittivirta.fi>}
 */

public class Ex43_20 {
    public static void main(String[] args) {
        int [][] table = {{1234},{5678}};
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
    }
}
