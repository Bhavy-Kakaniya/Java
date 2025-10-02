import java.util.Scanner;

public class table {
    static void table(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d x %d = %d\n", n, i, n * i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to print table: ");
        int n = sc.nextInt();
        table(n);
    }
}
