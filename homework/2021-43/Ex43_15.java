import java.io.Console;

/**
 * Class Ex43_15 contains Robin exercise 15 from week 43
 * 
 * @author Juuso Korhonen {@literal <juuso.korhonen@bittivirta.fi>}
 */
public class Ex43_15 {
    public static void main(String[] args) {
        Console c = System.console();

        System.out.println("Give me your favourite word:");
        String word = c.readLine();
        System.out.println("How many characters from the end do you want?");
        int length = Integer.parseInt(c.readLine());
        
        String result = "";
        for(int i=length-1;i>=0;i--) {
            result += word.charAt(word.length()-1-i);
        }

        System.out.println("Result: " + result);
    }
}
