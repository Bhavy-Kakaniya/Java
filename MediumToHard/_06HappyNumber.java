import java.util.Scanner;

public class _06HappyNumber {

    // function to check whether number is happy or not
    static boolean happy(int n) {

        int digit, sum = 0;

        while (n != 0) {
            digit = n % 10;
            n /= 10;
            sum += digit * digit;
        }

        // if sum is 1 then it is happy
        if (sum == 1)
            return true;

        // if sum is 4 then not happy because most of the happy number loops end at 4
        else if (sum == 4)
            return false;

        // recursively call function to do sum and check for happy number
        else
            return happy(sum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to check whether number is happy or not: ");
        int n = sc.nextInt();

        if (happy(n))
            System.out.println("Happy number");
        else
            System.out.println("Not happy number");

    }
}
