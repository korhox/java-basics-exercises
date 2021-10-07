//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// This file has exercise 5
//

class StringHelper {
    public static void main(String [] args) {
        if (equals("epic", "epic")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        if (equals("epic", "sdd")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static Boolean equals(String a, String b) {
        Boolean result = true;
        for (int i = 0; i<a.length() && result; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                result = false;
            }
        }
        return result;
    }

/*     public static String [] split(String subject) {
        for (int i = 0; i < subject.length(); i++) {
            if(subject.charAt(i) == '.') {

            }
        }
    } */
}
