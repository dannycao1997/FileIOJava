package Step4;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFour {
    /**
     * Yes, you can look at the other
     * examples in this lab to build your solution here.
     */
    // Print out a running total of all the
    // values in the input file.
    public static void main(String[] args) {
        try {

            int sum = 0; // starting from 0

            // creating a scanner to read file called input.txt
            Scanner sc = new Scanner(new File("/Users/danny/Projects/FileIOJava/Step4/input.txt"));

            while (sc.hasNext()) {
                // reads file entire file line numbers/integers
                int lineIn = sc.nextInt();
                // adds integers from each line to the next
                sum = sum + lineIn;
                // output/prints out sum of each line
                System.out.println("Running total = " + sum);
            }
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
