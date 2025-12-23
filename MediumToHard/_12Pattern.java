// 1 
// 1 * 3 * 1
// 1 * 3 * 5 * 3 * 1
// 1 * 3 * 5 * 7 * 5 * 3 * 1

import java.util.Scanner;

public class _12Pattern {

    static void pattern(int n) {
        for (int i = 1; i <= n; i++) {

            // Print left side (increasing odd numbers)
            for (int j = 1; j <= i; j++) {
                System.out.print(2 * j - 1);
                if (j != i)
                    System.out.print(" * ");
            }

            // Print right side (decreasing odd numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(" * " + (2 * j - 1));
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = sc.nextInt();
        pattern(n);

    }
}
