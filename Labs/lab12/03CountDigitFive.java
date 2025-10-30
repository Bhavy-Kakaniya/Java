import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountDigitFive {
    public static void main(String[] args) {
        if (args.length != 1) {
            return;
        }

        String fileName = args[0];
        File file = new File(fileName);

        int count = 0;

        try {
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                String line = reader.nextLine();

                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == '5') {
                        count++;
                    }
                }
            }

            reader.close();

            System.out.println("Number of occurrences of digit 5: " + count);

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found. Please check the file name or path");
        }
    }
}
