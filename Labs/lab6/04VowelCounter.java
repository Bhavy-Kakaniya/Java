// Create a class which ask the user to enter a sentence, and it should display count of
// each vowel type in the sentence. The program should continue till user enters a word
// “quit”. Display the total count of each vowel for all sentences.
import java.util.Scanner;

public class _04VowelCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int totalA = 0, totalE = 0, totalI = 0, totalO = 0, totalU = 0;
        
        System.out.println("Enter sentences (type 'quit' to exit):");
        
        while (true) {
            System.out.print("Enter a sentence: ");
            String sentence = sc.nextLine();
            
            if (sentence.equalsIgnoreCase("quit")) {
                break;
            }
            
            int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;
            
            for (char ch : sentence.toLowerCase().toCharArray()) {
                switch (ch) {
                    case 'a': countA++; break;
                    case 'e': countE++; break;
                    case 'i': countI++; break;
                    case 'o': countO++; break;
                    case 'u': countU++; break;
                }
            }
            
            totalA += countA;
            totalE += countE;
            totalI += countI;
            totalO += countO;
            totalU += countU;
            
            System.out.println("Vowel count for this sentence:");
            System.out.println("A: " + countA);
            System.out.println("E: " + countE);
            System.out.println("I: " + countI);
            System.out.println("O: " + countO);
            System.out.println("U: " + countU);
        }
        
        System.out.println("\nTotal vowel count for all sentences:");
        System.out.println("A: " + totalA);
        System.out.println("E: " + totalE);
        System.out.println("I: " + totalI);
        System.out.println("O: " + totalO);
        System.out.println("U: " + totalU);
        
        sc.close();
    }
}
