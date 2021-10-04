//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// This file has exercise 13
//

class Ex39_13 {
    public static void main(String [] args) {
        System.out.println(getRandom(-5, 5));
        System.out.println(getRandom(5, -5));
        System.out.println(getRandom(5, 15));
    }

    public static Integer getRandom(int min, int max) {
        if (min > max) { int t = max; max = min; min = t; }
        return (int) (Math.abs(min) - (Math.random() * (max + Math.abs(min) + 1)));
    }
}
