//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// This file has exercise 7
//

class Ex40_07 {
    public static void main(String [] args) {
        String [] taulukko = split("tiina,pekka,kalle", ':');
        System.out.println(taulukko[0]); // tulostaa "tiina"
        System.out.println(taulukko[1]); // tulostaa "pekka"
        System.out.println(taulukko[2]); // tulostaa "kalle"
    }

    public static String [] split(String subject, Character delimeter) {
        int noOfCommas = 1;
        for (int i = 0; i < subject.length(); i++) {
            noOfCommas = (subject.charAt(i) == delimeter) ? noOfCommas + noOfCommas : noOfCommas;
        }

        String [] result = new String[noOfCommas];
        int rIndex = 0;
        for (int i = 0; i < subject.length(); i++) {
            if(subject.charAt(i) == delimeter) {
                rIndex++;
            } else {
                result[rIndex] = (result[rIndex] == null) ? "" + subject.charAt(i) : result[rIndex] + subject.charAt(i);
            }
        }
        return result;
    }
}
