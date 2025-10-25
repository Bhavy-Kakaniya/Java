import java.util.Scanner;

public class DivideNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number (Num1): ");
            String num1Str = sc.nextLine();

            System.out.print("Enter second number (Num2): ");
            String num2Str = sc.nextLine();

            int num1 = Integer.parseInt(num1Str);
            int num2 = Integer.parseInt(num2Str);
            int result = num1 / num2;

            System.out.println("✅ Division Result: " + result);
        } 
        catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers only!");
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!");
        } 
        finally {
            System.out.println("Program execution completed.");
        }
    }
}
