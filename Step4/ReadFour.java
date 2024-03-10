package Step4;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFour {
    /**
     * Yes, you can look at the other
     * examples in this lab to build your solution here.
     */
    public static void main(String[] args) {
        int sum = 0;
        try {
            Scanner fileIn = new Scanner(new File("input.txt"));
            while (fileIn.hasNext()) {
                try {
                    sum += Integer.parseInt(fileIn.nextLine());
                    System.out.println("Running Total = " + sum);
                    fileIn.close();
                }
                    // Print out a running total of all the
                    // values in the input file.
                } catch (IOException e) {
                    System.out.println("File not found");
                }
            }
        }
    }