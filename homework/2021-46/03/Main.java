class Bird {
    public void lennä() {
        System.out.println("Lintu lentää");
    }
}
class Main {
    public static void main(String [] args) {
        Bird bird = new Bird();
        lennä(bird);
        
        class Struthioniformes extends Bird {
            @Override
            public void lennä() {
                System.out.println("Strutsi yrittää lentää");
            }
        }

        Struthioniformes strutsi = new Struthioniformes();
        strutsi.lennä();

        lennä(new Bird() {
                @Override
                public void lennä() {
                    System.out.println("Anonyymi lentää");
                }
            }
        );
    }
    public static void lennä(Bird b) {
        b.lennä();
    }
}