//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// This file has exercises 1 and 2
//
import java.io.Console;

class Ex38_08 {
    public static void main(String [] args) {
        Console c = System.console();

        int [] table = new int[10];  
        int i = 0;

        do {
            table[i++] = Integer.parseInt(c.readLine());
        } while (table.length == 10);
        
        for (i=table.length; i>0; i--) {
                System.out.println(table[i-1]);
        }
    }
}