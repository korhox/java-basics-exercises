//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// Tässä tiedostossa tehtävä 9
//

import java.io.Console;

public class Ex37_09 {
    public static void main(String [] args) {
        Console c = System.console();
        int i;
        int result = 0;
        
        System.out.println("Anna luku 1");
        int number1 = Integer.parseInt(c.readLine());
        System.out.println("Anna luku 2");
        int number2 = Integer.parseInt(c.readLine());
        
        for(i=0; number1 > i; i++) {
            result = result + number2;
        }

        System.out.println("Kertolaskun tulos: " + result);
    }
}