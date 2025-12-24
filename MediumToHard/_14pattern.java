import java.util.Scanner;

//   1234567
//1     1
//2    212
//3   32123
//4  4321234
//5   32123
//6    212
//7     1
public class _14Pattern {
    static void pattern(int n) {

        // upper half
        for (int i = 1; i <= n; i++) {
            // print spaces at first
            for (int spaces = n - i; spaces > 0; spaces--) {
                System.out.print(" ");
            }

            // print descending numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // print ascending numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // lower half
        for (int i = n - 1; i >= 1; i--) {
            // print leading spaces
            for (int spaces = n - i; spaces > 0; spaces--) {
                System.out.print(" ");
            }

            // print descending numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // print ascending numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        pattern(n);

    }
}
