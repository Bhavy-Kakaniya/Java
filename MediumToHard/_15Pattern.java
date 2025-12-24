import java.util.Scanner;
// 1
// 1 2 1
// 1 * 3 * 1
// 1 * * 4 * * 1
// 1 * * * 5 * * * 1
// 1 * * * * 6 * * * * 1

public class _15Pattern {
    static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i == j)
                    System.out.print(" " + j + " ");
                else if (j == 1 || j == 2 * i - 1) {
                    System.out.print(" 1 ");
                } else
                    System.out.print(" * ");
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
