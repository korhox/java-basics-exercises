//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// This file has exercise 12
//

class Ex38_12 {
    public static void main(String [] args) {

        double random = Math.random() * 3;
        int randomInt = (int) random;

        String [] table = {"rock", "paper", "scissors"};

        System.out.println(table[randomInt]);

    }
}