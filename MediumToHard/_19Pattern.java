import java.util.Scanner;

public class _19Pattern {
    static void pattern(int n) {
        // starting number
        int num = 1;

        for (int i = 0; i < n; i++) {
            // if row is even left to right
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(num + " ");
                    num++;
                }
            }
            // if row is odd right to left
            else {
                int temp = num + n - 1;
                for (int j = 0; j < n; j++) {
                    System.out.print(temp-- + " ");
                }
                // jump to next block
                num += n;
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
