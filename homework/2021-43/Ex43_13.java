/**
 * Class Ex43_13 contains Robin exercise 13 from week 43
 * 
 * @author Juuso Korhonen {@literal <juuso.korhonen@bittivirta.fi>}
 */

public class Ex43_13 {
    public static void main(String[] args) {
        int [] array = {1,2,8};
        System.out.println(find(array, 1));
    }
    public static boolean find(int [] array, int value) {
        for(int i=0; i>=array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }
}
