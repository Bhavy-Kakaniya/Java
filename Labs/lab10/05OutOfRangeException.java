import java.util.Scanner;

class OutOfRangeException extends Exception {
    public OutOfRangeException(String message) {
        super(message);
    }
}

public class NumberRangeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num < 10 || num > 50) {
                throw new OutOfRangeException("Number out of range! Please enter a number between 10 and 50.");
            } else {
                int square = num * num;
                System.out.println("Square of " + num + " is: " + square);
            }
        } 
        catch (OutOfRangeException e) {
            System.out.println(e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        }
        finally {
            System.out.println("Program execution completed.");
        }
    }
}
