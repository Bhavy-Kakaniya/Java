// Write a program to find length of string and print second half of the string
import java.util.Scanner;
public class lengthofstr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String s1 = sc.nextLine();
        int string = 0 ;
        for(int i=0; i<s1.length();i++){
            string++;
        }
        System.out.println("length of string: "+string);
        for(int i=(s1.length()/2); i<s1.length();i++){
            System.out.print(s1.charAt(i));
        }
    }
}
