public class Ihminen {
    public Ihminen(String nimi) {
        this.setName(nimi);
    }
    
    private String nimi;

    public void nuku() {
        System.out.println(this.getName() + " nukkuu");
    }
    public void syo() {
        System.out.println(this.getName() + " syö");
    }
    public void juo() {
        System.out.println(this.getName() + " juo");
    }
    public void lisaanny() {
        System.out.println(this.getName() + " lisääntyy");
    }
    public void setName(String name) {
        nimi = name;
    }
    public String getName() {
        return nimi;
    }
    public void tulostaTiedot() {
        System.out.println("Nimi: " + this.nimi);
    }
}