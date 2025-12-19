// A number is ugly number if it is positive and not have prime factor other than 2, 3, 5
import java.util.Scanner;

public class _02UglyNumber {

    // boolean function to check if number is ugly or not
    static boolean checkUgly(int n) {
        // check for positive number
        if (n <= 0)
            return false;

        // check till n is divisible by 2 3 or 5
        while (n % 2 == 0)
            n /= 2;
        while (n % 3 == 0)
            n /= 3;
        while (n % 5 == 0)
            n /= 5;

        if (n == 1)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to check whether ugly or not: ");
        int n = sc.nextInt();

        if (checkUgly(n))
            System.out.println("Ugly number");
        else
            System.out.println("Not ugly number");
    }
}
