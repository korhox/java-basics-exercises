abstract class MyytavaTuote {
    public void myy() {
        
    }
}

class Main {
    public static void main(String [] args) {
        class EnergiaJuoma extends MyytavaTuote {
            public void myy() {
                System.out.println("Energiajuoma myyty");
            }
        }
        class Koira extends MyytavaTuote {
            public void myy() {
                System.out.println("Koira myyty");
            }
        }

        EnergiaJuoma ed = new EnergiaJuoma();
        myy(ed);

        Koira koire = new Koira();
        myy(koire);

        MyytavaTuote x = new MyytavaTuote() {
            public void myy() {
                System.out.println("anonyymi myyty");
            }
        };
        myy(x);

        myy(new MyytavaTuote() {
            public void myy() {
                System.out.println("anonyymi 2 myyty");
            }
        });
    }
    public static void myy(MyytavaTuote m) {
        m.myy();
    }
}