//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// This file has exercise 9
//

class Ex40_09 {
    public static void main(String [] args) {
        // Tulostaa true
        System.out.println(contains("koirarotu", "raro"));

        // Tulostaa true
        System.out.println(contains("koirarotu", "rotu"));

        // Tulostaa false
        System.out.println(contains("koirarotu", "tampio"));
    }

    public static boolean contains(String subject, String search) {
        boolean returnTrue = true;
        for (int i = 0; i < subject.length(); i++) {
            for (int j = 0; j < search.length(); j++) {
                if (j + i < subject.length()) {
                    if (subject.charAt(j + i) != search.charAt(j)) {
                        returnTrue = false;
                    }
                }
            }
        }
        return returnTrue;
    }
}
