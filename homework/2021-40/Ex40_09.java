//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// This file has exercise 9
//

class Ex40_09 {
    public static void main(String [] args) {
        // Tulostaa true
        System.out.println(contains("koirarotu", "raro"));
        
        // Tulostaa false
        System.out.println(contains("koirarotu", "tampio"));
    }

    public static boolean contains(String subject, String search){
        for (int i = 0; i <= subject.length() - search.length(); i++) {
            if(subject.substring(i, i + search.length()).equals(search)){
                return true;
            }
        }
        return false;
    }
}
