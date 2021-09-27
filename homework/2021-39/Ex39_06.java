//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// This file has exercise 6
//


class Ex39_6 {
    public static void main(String [] args) {
        repeat('X', 5);
    }
    public static void repeat(Character character, Integer amount) {
        for (int i=0; i<amount; i++) {
            System.out.print(character);
        }
        System.out.println();
    }
}