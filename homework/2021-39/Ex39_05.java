//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// This file has exercise 5
//

import java.io.Console;

class Ex39_5 {
    public static void main(String [] args) {
        Console c = System.console();

        System.out.println("Anna 2 lukua, kiitos:");
        int a = Integer.parseInt(c.readLine());
        int b = Integer.parseInt(c.readLine());
        System.out.println("Antamiesi lukujen tulos: " + laske(a, b));
    }
    public static int laske(Integer a, Integer b) {
        return a + b;
    }
}