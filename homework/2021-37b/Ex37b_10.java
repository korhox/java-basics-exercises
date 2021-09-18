//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// Tässä tiedostossa tehtävä 9
//


import java.io.IOException;
import java.util.List;
import java.nio.file.Files;
import java.nio.charset.Charset;
import java.io.File;

public class Ex37b_10 {
    public static void main(String [] args) throws IOException {
        String textFileName = "Ex37b_10_input.txt";
        List<String> allLines = Files.readAllLines(new File(textFileName).toPath(), Charset.defaultCharset());

        int highestNumber = 0;
        int lowestNumber = 0;

        // Check highest and lowest numbers from the file
        for(int i=0; i<allLines.size(); i++) {
            int lineNo = Integer.parseInt(allLines.get(i));
            if(highestNumber < lineNo) {
                highestNumber = lineNo;
            }
            if(lowestNumber > lineNo) {
                lowestNumber = lineNo;
            }
        }

        // Loop through the lines
        for(int i=0; i<allLines.size(); i++) {
            int lineNo = Integer.parseInt(allLines.get(i));
            String result = "";
            String result2 = "";
            // Loop through lowest number of the line number
            for(int i2=0; i2<Math.abs(lowestNumber);i2++) {
                // If line number is negative, print out the pole
                if(lineNo < 0) {
                    // if line number is lower than loop point, add space
                    if(i2>Math.abs(lineNo)){
                        result = result + " ";
                    }else{ // if not, add dash
                        result = result + "-";
                    }
                } else { // If not ,print out spaces
                    if(i2<Math.abs(lowestNumber)){
                        result = result + " ";
                    }
                }
            }
            // Flip the minuses (using palindrome exercise)
            String resultMinus = "";
            for (int i2=result.length(); i2>0; i2--) {
                resultMinus = resultMinus + result.charAt(i2-1);
            }
            // Loop through highest number of the line number
            for(int i2=0; i2<Math.abs(highestNumber);i2++) {
                // if line number is positive
                if(lineNo > 0) {
                    // if loop is lower than number, add plus sign
                    if(i2<Math.abs(lineNo)){
                        result2 = result2 + "+";
                    }
                }
            }
            // Print out the results for the line
            System.out.println(resultMinus + "|" + result2);
        }
    }
}


