import java.io.Console;

/**
 * Class Ex43_14 contains Robin exercise 14 from week 43
 * 
 * @author Juuso Korhonen {@literal <juuso.korhonen@bittivirta.fi>}
 */
public class Ex43_14 {
    public static void main(String[] args) {
        Console c = System.console();

        System.out.println("Give me your favourite word:");
        String word = c.readLine();
        System.out.println("How many characters from the beginning do you want?");
        int length = Integer.parseInt(c.readLine());
        
        String result = "";
        for(int i=0;i<=length-1;i++) {
            result += word.charAt(i);
        }

        System.out.println("Result: " + result);
    }
}
