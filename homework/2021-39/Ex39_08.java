//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// This file has exercise 8
//

import java.io.Console;

class Ex39_8 {
    public static void main(String [] args) {
        Console c = System.console();

        System.out.println("Kuinka korkean neliön haluat?");
        int length = Integer.parseInt(c.readLine());
        for (int i=0;i<length;i++) {
            System.out.println(repeat('X', 5));
        }
    }
    public static String repeat(Character character, Integer amount) {
        String result = "";
        for (int i=0; i<amount; i++) {
            result = result + character;
        }
        return result;
    }
}