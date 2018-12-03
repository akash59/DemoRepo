package learn.java.java.practice.programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountWordOccurrenceInAFile {

    final static String BASEPATH = System.getProperty("user.dir");

    public static void main(String[] args) {

        File file = new File(BASEPATH + "//testFile.txt");
        System.out.println("The word 'terrorism' occurs :: " + countOccurrences(file, "terrorism") + " times");
    }

    public static int countOccurrences(File file, String word) {

         int count = 0;

         try {

            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String nextToken = scan.next();
                System.out.println(nextToken);
                if (nextToken.equalsIgnoreCase(word)) {
                    count++;
                }
            }
            return count;

        } catch (FileNotFoundException fe) {
            System.out.println(fe.getMessage());
        }

        return count;
    }

}