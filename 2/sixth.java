public class sixth {
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
    }
}
