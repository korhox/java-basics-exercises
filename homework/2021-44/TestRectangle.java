class TestRectangle {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();

        // vastaukseksi tule 0 koska arvoja ei ole vielä asetettu.
        // java alutaa muuttujat meidän puolesta 0:ksi
        System.out.println(rect.height);
        System.out.println(rect.width);

        // Rectangle@251a69d7 -> Oletusarvoisesti Rectangle-luokan arvo tulee toString-
        // metodilla, joka palauttaa olion muistipaikan
        System.out.println(rect);

        Rectangle rect1 = rect;

        // Uuden muuttujan muistipaikka on sama
        System.out.println(rect1);

        rect.width = 10;
        rect.height = 20;

        // Koska rect1 on sama, kun rect, muuttujia muuttaessa myös rect 1 muuttuu
        System.out.println(rect1.height);
        System.out.println(rect1.width);
    }
}