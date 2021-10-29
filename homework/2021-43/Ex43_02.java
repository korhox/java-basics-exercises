import java.io.Console;

/**
 * Robin exercise 02 from week 43
 * 
 * @author Juuso Korhonen <juuso.m.korhonen@tuni.fi>
 */
public class Ex43_02 {
    public static void main(String[] args) {
        Console c = System.console();

        System.out.println("Anna kaksi lukua:");

        int numbero_uno = Integer.parseInt(c.readLine());
        int numbero_dos = Integer.parseInt(c.readLine());

        if (numbero_dos + numbero_uno == 10) {
            System.out.println("Se on täys kymppi!");
        } else {
            System.out.println("Ei oo kymppi :(");
        }
    }
}
