//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// This file has exercise 7
//
import java.io.Console;

class Ex38_09 {
    public static void main(String [] args) {
        String [] table = new String[6];  
        Console c = System.console();
        String longest = "";

        System.out.println("Please enter six names:");
        for (int i=0; i<table.length; i++) {
            if (i==5) {
                System.out.println("And the last one:");
            }
            table[i] = c.readLine();
        }

        for (int i=0; i<table.length; i++) {
            if(table[i].length() > longest.length()) {
                longest = table[i];
            }
        }

        System.out.println("The longest one you gave was: " + longest);
    }
}