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
        int sum = 0;

        System.out.println("Please enter 10 absolute numbers.");
        for (i=0; i<table.length; i++) {
            if (i==9) {
                System.out.println("Enter the last number:");
            }
            table[i] = Integer.parseInt(c.readLine());
            sum = sum + table[i];
        };

        System.out.println("Sum of the numbers: " + sum);
    }
}