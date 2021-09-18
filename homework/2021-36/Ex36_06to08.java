//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// Tässä tiedostossa tehtävät 6 - 8
//

public class Ex36_06to08 {
    public static void main(String [] args) {
        int i;
        // Tehtävä 6.a
        i = 1;
        System.out.println("Tehtävä 6.a");
        while(i <= 10) {
            System.out.println(i);
            i++;
        }

        // Tehtävä 6.b
        i = 5;
        System.out.println("Tehtävä 6.b");
        while(i <= 15) {
            System.out.println(i);
            i++;
        }

        // Tehtävä 6.c
        i = 10;
        System.out.println("Tehtävä 6.c");
        while(i >= 0) {
            System.out.println(i);
            i--;
        }

        // Tehtävä 6.d
        i = 10;
        System.out.println("Tehtävä 6.d");
        while(i >= 0) {
            if (i % 2 == 0) System.out.println(i);
            i--;
        }

        // Tehtävä 7.a
        System.out.println("Tehtävä 7.a");
        for(i=1; i <= 10; i++) {
            System.out.println(i);
        }

        // Tehtävä 7.b
        System.out.println("Tehtävä 7.b");
        for(i=5; i <= 15; i++) {
            System.out.println(i);
        }

        // Tehtävä 7.c
        System.out.println("Tehtävä 7.c");
        for(i=10; i >= 0; i--) {
            System.out.println(i);
        }

        // Tehtävä 7.d
        System.out.println("Tehtävä 7.d");
        for(i=10; i >= 0; i--) {
            if (i % 2 == 0) System.out.println(i);
        }

        // Tehtävä 8.a
        i = 1;
        System.out.println("Tehtävä 8.a");
        do {
            System.out.println(i);
            i++;
        }
        while(i <= 10);

        // Tehtävä 8.b
        i = 5;
        System.out.println("Tehtävä 8.b");
        do {
            System.out.println(i);
            i++;
        }
        while(i <= 15);

        // Tehtävä 8.c
        i = 10;
        System.out.println("Tehtävä 8.c");
        do {
            System.out.println(i);
            i--;
        }
        while(i >= 0);

        // Tehtävä 8.d
        i = 10;
        System.out.println("Tehtävä 8.d");
        do {
            if (i % 2 == 0) System.out.println(i);
            i--;
        }
        while(i >= 0);
    }
}
