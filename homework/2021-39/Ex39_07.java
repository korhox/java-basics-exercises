//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// This file has exercise 7
//


class Ex39_7 {
    public static void main(String [] args) {
        System.out.println(repeat('X', 5));
    }
    public static String repeat(Character character, Integer amount) {
        String result = "";
        for (int i=0; i<amount; i++) {
            result = result + character;
        }
        return result;
    }
}