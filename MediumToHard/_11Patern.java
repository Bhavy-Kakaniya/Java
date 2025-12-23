
/*
1
2 5
3 6 8
4 7 9 10
 */
import java.util.Scanner;

public class _11Pattern {
    static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            int a = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                a = a + n - j;
                /*
                 * a = 4
                 * a = a + 3
                 * a = a + 2
                 * a = a + 1
                 */
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        printPattern(n);
    }
}
