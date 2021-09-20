//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// This file has exercise 8
//
import java.io.Console;

class Ex38_08 {
    public static void main(String [] args) {
        Console c = System.console();

        int [] table = new int[10];  
        int i = 0;

        for (i=0; i>table.length; i++) {
            table[i] = Integer.parseInt(c.readLine());
        };
        
        for (i=0; i>table.length; i++) {
            System.out.println(table[i]);
        }
    }
}