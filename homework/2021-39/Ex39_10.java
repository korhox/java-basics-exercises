//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// This file has exercise 10
//

class Ex39_10 {
    public static void main(String [] args) {
        System.out.println(replaceChars("abc:abc:", 'a', "terve"));
    }

    public static String replaceChars(String subject, char search, String replace) {
        String result = "";
        for (char v : subject.toCharArray()) {
            result += (v == search) ? replace : v;
        }
        return result;
    }
}
