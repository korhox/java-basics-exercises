//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// This file has exercise 10
//
import java.io.Console;

class Ex38_10 {
    public static void main(String [] args) {
        Console c = System.console();

        String [] table = new String[10];  
        String input = "";
        int i = 0;
        do {
            table[i++] = input;
        } while ((input = c.readLine()).equals("lopeta"));
        
        for (i=table.length; i>0; i--) {
            if (i%2==0) {
                System.out.println(table[i-1]);
            }
        }
    }
}