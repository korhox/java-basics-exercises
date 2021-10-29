public class MyMath {
    public static void main(String[] args) {
        System.out.println(isPositive(0));
    }

    /**
     * Returns true if number given is positive
     * 
     * @param isPositive the number being tested
     * @return weather result is true or false
     */
    public static boolean isPositive(int number) {
        if (number >= 0) {
            return true;
        } else {
            return false;
        }
    }
}