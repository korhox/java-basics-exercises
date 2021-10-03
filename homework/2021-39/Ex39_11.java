//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// This file has exercise 11
//

class Ex39_11 {
    public static void main(String [] args) {
        if (isPaldindrome("abba")) {
            System.out.println("abba is");
        } else {
            System.out.println("abba is");
        }
        if (isPaldindrome("popcorn")) {
            System.out.println("popcorn is");
        } else {
            System.out.println("popcorn is not");
        }
    }

    public static Boolean isPaldindrome(String subject) {
        String strBackwards = "";
        for (int i = subject.length(); i>0; i--) {
            strBackwards += subject.charAt(i-1);
        }
        return (strBackwards.equals(subject)) ? true : false;
    }
}
