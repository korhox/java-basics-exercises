//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// This file has exercise 8
//

class Ex40_08 {
    public static void main(String [] args) {
        String [] stringArray = {"12", "22", "33"};
        int [] intArray = toIntArray(stringArray);

        for (int v : intArray) {
            System.out.println(v);
        }
    }

    public static int [] toIntArray(String [] subject) {
        int [] intArray = new int[subject.length];
        for (int i = 0; i < subject.length; i++) {
            intArray[i] = Integer.parseInt(subject[i]);
        }
        return intArray;
    }
}
