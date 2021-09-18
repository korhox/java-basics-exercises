//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// Tässä tiedostossa tehtävä 9
//


import java.io.IOException;
import java.util.List;
import java.nio.file.Files;
import java.nio.charset.Charset;
import java.io.File;

public class Main {
    public static void main(String [] args) throws IOException {
        String textFileName = "input.txt";
        List<String> allLines = Files.readAllLines(new File(textFileName).toPath(), Charset.defaultCharset());

        int highestNumber = 0;
        int lowestNumber = 0;

        for(int i=0; i<allLines.size(); i++) {
            int lineNo = Integer.parseInt(allLines.get(i));
            System.out.println(lineNo);
            if (highestNumber < lineNo) {
                highestNumber = lineNo;
            }
            if (lowestNumber > lineNo) {
                lowestNumber = lineNo;
            }
        }
        System.out.println("Highest: " + highestNumber);
        System.out.println("Lowest: " + lowestNumber);

        for(int i=0; i<allLines.size(); i++) {
            int lineNo = Integer.parseInt(allLines.get(i));
            String result = "";

            lowestNumber = Math.abs(lowestNumber);
            result = lineNo;
            for(int i2=0; i<lowestNumber; i++) {
                if(i2 < lineNo) {
                    result = result + " ";
                } else {
                    result = result + "-";
                }
            }

            System.out.println(result + "|");
        }
    }
}