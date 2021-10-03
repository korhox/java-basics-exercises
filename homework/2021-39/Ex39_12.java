//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// This file has exercise 12
//

class Ex39_12 {
    public static void main(String [] args) {
        if (isPaldindrome("abba", true)) {
            System.out.println("abba is");
        } else {
            System.out.println("abba is");
        }
        if (isPaldindrome("popcorn", false)) {
            System.out.println("popcorn is");
        } else {
            System.out.println("popcorn is not");
        }
        if (isPaldindrome("race car", true)) {
            System.out.println("race car is");
        } else {
            System.out.println("race car is not");
        }
        if (isPaldindrome("race car", false)) {
            System.out.println("race car is");
        } else {
            System.out.println("race car is not");
        }
    }

    public static Boolean isPaldindrome(String subject, boolean includeWhiteSpaces) {
        String strBackwards = "";
        for (int i = subject.length(); i>0; i--) {
            strBackwards += subject.charAt(i-1);
        }
        if (includeWhiteSpaces) {
            return (strBackwards.equals(subject)) ? true : false;
        } else {
            return (strBackwards.replace(" ", "").equals(subject.replace(" ", ""))) ? true : false;
        }
    }
}
