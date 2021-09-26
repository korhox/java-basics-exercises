import java.io.Console;

//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// This file has exercise 14
//

class Ex38_14 {
    public static void main(String [] args) {

        String [] table = new String[100];

        for (int i=0; i<table.length; i++) {

            double random = Math.random() * 100;
            int randomInt = (int) random;
    
            System.out.println(randomInt);

            table[i] = random;
            System.out.println(table[i]);

        }
    }
}