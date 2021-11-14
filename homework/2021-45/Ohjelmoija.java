public class Ohjelmoija extends Ihminen {
    public Ohjelmoija(String nimi, int Palkka) {
        super(nimi);
        this.setPalkka(palkka);
    }

    private int palkka = 0;

    public void osallistuCyberGothDanceJuhlaan() {
        System.out.println(this.getName() + " osallistuu Jussin Cyber Goth Dance-juhlaan");
        this.lisaanny();
    }
    public void ohjelmoi() {
        System.out.println(this.getName() + " ohjelmoi");
    }
    public void lisaanny() {
        if(this.palkka > 5000) {
            System.out.println(this.getName() + " - ohjelmoija lisääntyy");
        } else {
            System.out.println(this.getName() + " - ohjelmoija yrittää lisääntyä");
        }
    }
    public void setPalkka(int p) {
        if(p < 1000) {
            palkka = 1000;
        } else if (p > 10000) {
            palkka = 10000;
        } else {
            palkka = p;
        }
    }
    public int getPalkka() {
        return palkka;
    }
    public void tulostaTiedot() {
        super.tulostaTiedot();
        System.out.println("Palkka: " + this.palkka);
    }
}