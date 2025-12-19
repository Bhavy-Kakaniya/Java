
// A number is automorphic if its square has same last digit as number's last digit
import java.util.Scanner;

public class _04AutomorphicNumber {

    static boolean automorphic(int n) {
        // check for negative
        if (n < 0)
            return false;

        //check if last digit of squared and original number is same or not
        int square = n * n;
        if (square % 10 == n % 10)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to check whether it is automorphic or not: ");
        int n = sc.nextInt();

        if (automorphic(n))
            System.out.println("Automorphic number");
        else
            System.out.println("Not automorphic number");

    }
}
