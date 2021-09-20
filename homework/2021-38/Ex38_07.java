//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// This file has exercises 1 and 2
//

class Ex38_07 {
    public static void main(String [] args) {

        String [] table = new String[6];  

        int i = 0;
        table[i++] = "Jussi";
        table[i++] = "Jesse";
        table[i++] = "Jasmin";
        table[i++] = "Joona";
        table[i++] = "Juuso";
        table[i++] = "Janette";
        
        for (i=table.length; i>0; i--) {
            if (i%2==0) {
                System.out.println(table[i-1]);
            }
        }
    }
}