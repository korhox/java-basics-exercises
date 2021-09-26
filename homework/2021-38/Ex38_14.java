import java.io.Console;

//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// This file has exercise 14
//

class Ex38_14 {
    public static void main(String [] args) {

        int [] table = new int[100];

        for (int i=0; i<table.length; i++) {

            double random = Math.random() * 100 + 1;

            table[i] = (int) random;
            System.out.println(table[i]);

        }
    }
}