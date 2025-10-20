
// Write a program to demonstrate Arithmetic Exception and ArrayIndexOutOfBounds Exception using try-catch block.
import java.util.Scanner;

public class _01Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter number1: ");
                int n1 = sc.nextInt();
                System.out.print("Enter number2: ");
                int n2 = sc.nextInt();
                int ans = n1 / n2;
                System.out.println(ans);
                break;
            } catch (Exception e) {
                System.out.println("divide by zero is not allowed");
            }
        }
        // int b[] = { 10, 11, 12 };

        // while (true) {
        // try {
        // System.out.println("Enter a index to display number stored on it: ");
        // int number = sc.nextInt();
        // System.out.println(b[number]);
        // break;
        // } catch (ArrayIndexOutOfBoundsException e) {
        // System.out.println("error size of array is smaller enter smaller number");
        // }
        // }
    }
}
