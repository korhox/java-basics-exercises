//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// This file has exercise 4
//

class Ex40_04 {
    public static void main(String [] args) {
        System.out.println(print('x', absolute(-3)));
        System.out.println(print('a', absolute(4)));
    }

    public static String print(char letter, int amount) {
        String result = "";
        for(int i = 0; i<amount; i++) {
            result += letter;
        }
        return result;
    }

    public static Integer absolute(int number) {
        return (number < 0) ? -number : number;
    }
}
