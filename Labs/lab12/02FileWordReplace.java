import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWordReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter input file name: ");
        String inputFileName = sc.nextLine();

        System.out.print("Enter output file name: ");
        String outputFileName = sc.nextLine();

        System.out.print("Enter word to replace: ");
        String word1 = sc.nextLine();

        System.out.print("Enter new word: ");
        String word2 = sc.nextLine();

        File inputFile = new File(inputFileName);
        File outputFile = new File(outputFileName);

        int replacements = 0;
        StringBuilder content = new StringBuilder();

        try {
            Scanner fileReader = new Scanner(inputFile);

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                int count = countOccurrences(line, word1);
                replacements += count;
                line = line.replaceAll(word1, word2);
                content.append(line).append("\n");
            }

            fileReader.close();

            PrintWriter writer = new PrintWriter(outputFile);
            writer.print(content.toString());
            writer.close();

            System.out.println("\nReplacement complete!");
            System.out.println("Total replacements made: " + replacements);
            System.out.println("Modified content written to: " + outputFileName);

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found");
        }

        sc.close();
    }

    private static int countOccurrences(String line, String word) {
        int count = 0;
        int index = 0;
        while ((index = line.indexOf(word, index)) != -1) {
            count++;
            index += word.length();
        }
        return count;
    }
}
