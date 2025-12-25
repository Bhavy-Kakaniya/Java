import java.util.Scanner;

public class _17PascalTriangle {
    static void printPascal(int n) {
        for (int i = 0; i < n; i++) {
            int number = 1;

            // Print spaces for alignment
            for (int spaces = n - i; spaces > 0; spaces--) {
                System.out.print("  ");
            }

            // Print numbers in a row
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        printPascal(n);
    }
}
