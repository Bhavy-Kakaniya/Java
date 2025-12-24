import java.util.Scanner;
//  1 2 3 4 5 6 7
//1 * * * * * * *
//2   *       *
//3     *   *
//4       *
//5     *   *
//6   *       *
//7 * * * * * * *

public class _13Pattern {

    static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    System.out.print(" * ");
                } else if ((i + j) == (n + 1))
                    System.out.print(" * ");
                else if (i == 1 || i == n)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter odd number for better pattern: ");
        int n = sc.nextInt();
        printPattern(n);
    }
}
