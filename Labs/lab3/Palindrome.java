import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int n = sc.nextInt();
        int orignal = n;
        int revn = 0;
        int rem = 0;
        while (n != 0) {
            rem = n % 10;
            revn = (revn * 10) + (rem);
            n = n / 10;
        }
        if (orignal == revn) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}
