//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// This file has exercise 6
//

class Ex38_06 {
    public static void main(String [] args) {
        int [] table = new int[3];  

        table[0] = 12;
        table[1] = 99;
        table[2] = 32;
        
        for (int i=3; i>0; i--) {
            System.out.println(table[i-1]);
        }
    }
}