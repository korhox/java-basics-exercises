//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// This file has exercises 1 and 2
//

class Ex38_01to02 {
    public static void main(String [] args) {
        int [] table = new int[3];  

        table[0] = 12;
        table[1] = 99;
        table[2] = 32;
        
        // Exercise 1
        System.out.println(table[0]);
        System.out.println(table[table.length-1]);

        // Exercise 2
        System.out.println("Table length: " + table.length);
    }
}