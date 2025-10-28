import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileWordLineCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        File file = new File(fileName);

        int lineCount = 0, wordCount = 0, charCount = 0;

        try {
            Scanner fileReader = new Scanner(file);

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                lineCount++;

                charCount += line.length();

                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }

            fileReader.close();

            System.out.println("Number of lines: " + lineCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of characters: " + charCount);

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }

        sc.close();
    }
}
