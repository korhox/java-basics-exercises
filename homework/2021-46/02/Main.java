
class Birb {
    public Birb(String text) {
        System.out.println(text);
    }
}

class Main {
    public static void main(String [] args) {
        String text = "lintu syntyi";
        text = "eipäs synnykään"; // kyllä tää vaan toimii Java 16 versiossa :3
        Birb birb = new Birb(text);
    }
}
