//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// This file has exercise 3
//
import java.io.Console;
class Ex39_03 {
    public static void main(String [] args) {
        Console c = c.readLine();
        System.out.println("Anna nimi:");
        tulostaJokinNimi(c.readLine());
        tulostaJokinNimi("Jeppe");
    }
    public static void tulostaJokinNimi(String nimi) {
        System.out.println(nimi);
    }
}