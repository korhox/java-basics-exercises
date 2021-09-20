//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// This file has exercise 12
//

class Ex38_12 {
    public static void main(String [] args) {

        double random = Math.random() * 3;
        int randomInt = (int) random;

        String [] table = new String[3];  

        table[0] = "rock";
        table[1] = "paper";
        table[2] = "scissors";

        System.out.println(table[randomInt]);

    }
}