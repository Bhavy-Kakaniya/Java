import java.util.Scanner;

public class _01PrimeNumber {

    // boolean function to check whether number is prime or not
    static boolean checkPrime(int n) {
        for (int i = 2; i <= (n / 2); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        if (checkPrime(n))
            System.out.println("Prime number");
        else
            System.out.println("Not prime number");
    }
}
