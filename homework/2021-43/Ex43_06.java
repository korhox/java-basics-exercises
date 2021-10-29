/**
 * Robin exercise 06 from week 43
 * 
 * @author Juuso Korhonen <juuso.m.korhonen@tuni.fi>
 */
import java.io.Console;

public class Ex43_06 {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.println("Anna kaksi lukua joiden väliltä tulostamme numerot");
        int luku1 = Integer.parseInt(c.readLine());
        int luku2 = Integer.parseInt(c.readLine());
        int tmp = 0;

        if (luku1 > luku2) {
            luku1 = tmp;
            luku1 = luku2;
            luku2 = tmp;
        }

        for (int i=luku1; i<=luku2; i++) {
            System.out.println(i);
        }
    }
}
