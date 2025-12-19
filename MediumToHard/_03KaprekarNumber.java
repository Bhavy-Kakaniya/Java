
// A number is Kaprekar if it is non negative, when squared can split in two parts having sum equal to original
import java.util.Scanner;

public class _03KaprekarNumber {
    static boolean kaprekar(int n) {

        // check if number is positive
        if (n <= 0)
            return false;

        // count number of digits
        int digit = 0, temp = n;
        while (temp != 0) {
            temp /= 10;
            digit++;
        }

        // square the number
        int squared = n * n;

        // split into left and right parts
        int right = squared % (int) Math.pow(10, digit);
        int left = squared / (int) Math.pow(10, digit);

        // check condition if it is correct then it will return true else false so no need of if else
        return (left + right == n);
    }

    // struct node *newNode = (struct node *) malloc(sizeof(struct node));
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to check whether kaprekar or not: ");
        int n = sc.nextInt();

        if (kaprekar(n))
            System.out.println("Kaprekar number");
        else
            System.out.println("Not kaprekar number");

    }
}
