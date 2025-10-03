import java.util.Scanner;
public class sum1 {
    static int sumOfNumber(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a : ");
        int a = sc.nextInt();
        System.out.println("enter b : ");
        int b = sc.nextInt();
        int c = sumOfNumber(a, b);
        System.out.println(c);
    }
}
