//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// This file has exercise 13
//

class Ex38_13 {
    public static void main(String [] args) {
        if(args.length == 3) {
            int arg1 = Integer.parseInt(args[0]);
            int arg2 = Integer.parseInt(args[2]);

            if (args[1] == "+") {
                System.out.println(arg1 + arg2);
            } else if (args[1] == "-") {
                System.out.println(arg1 - arg2);
            } else if (args[1] == "*" || args[1] == "x") {
                System.out.println(arg1 * arg2);
            } else if (args[1] == ":" || args[1] == "/") {
                System.out.println(arg1 / arg2);
            } else if (args[1] == "%") {
                System.out.println(arg1 % arg2);
            } else {
                System.out.println("The operator '"+args[1]+"' is not supported.");
            }
        } else {
            System.out.println("Please give exactly three parameters. Number 1, operator and number 2.");
        }
    }
}