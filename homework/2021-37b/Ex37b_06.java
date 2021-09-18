//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// Tässä tiedostossa tehtävä 2
//

public class Ex06 {
    public static void main(String[] args) {
        System.out.println(1+1); // = 2 (integerit lasketaan yhteen)
        System.out.println("merkkijono1" + "merkkijono2"); // = merkkijono1merkkijono2 (stringit liitetään)
        System.out.println("merkkijono1" + 2); // = merkkijono12 (kun toinen muuttuja on string, ne vain liitetään, ei lasketa)
        System.out.println("merkkijono1" + 3.3); // = merkkijono13.3 (sama homma)
        System.out.println(3.3 + "merkkijono" + 3.3); // = 3.3merkkijono3.3 (sama homma)
        System.out.println(2 + "merkkijono1"); // = 2merkkijono (sama homma)
        System.out.println(2 + 'a'); // = merkin 'a' merkistönumero on 97, kun tähän lisätään 2, saadaan 99
        System.out.println('a' + 'b'); // = merkin 'a' merkistönumero on 97 ja merkin 'b' on 98. Näiden yhteenlaskettu summa on 195.
    }
}