//   1  2  3  4  5  6  7  8  9
//1  *           *  *  *  *  * 
//2  *           * 
//3  *           *
//4  *           *
//5  *  *  *  *  *  *  *  *  *
//6              *           *
//7              *           *
//8              *           *
//9  *  *  *  *  *           *

import java.util.Scanner;

public class _16Pattern {

    static void pattern(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {

                // plus at center
                if (i == n || j == n)
                    System.out.print("* ");

                // top left
                else if (i <= n && j == 1)
                    System.out.print("* ");
                else if (i == 1 && j > n)
                    System.out.print("* ");

                // top right
                else if (j == 2 * n - 1 && i > n)
                    System.out.print("* ");
                else if (i == 2 * n - 1 && j < n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
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
