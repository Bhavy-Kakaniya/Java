
// A number is pronic if it product of two consecutive positive numbers
import java.util.Scanner;

public class _05PronicNumber {
    static boolean pronic(int n) {
        int currentI;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                currentI = i;
                if (currentI * (currentI + 1) == n)
                    return true;
                else
                    continue;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check whether number is pronic or not: ");
        int n = sc.nextInt();
        if (pronic(n))
            System.out.println("Pronic number");
        else
            System.out.println("Not pronic number");

    }
}
