import java.util.Scanner;

public class sumscan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number A : ");
        int a = sc.nextInt();
        System.out.println("enter number B : ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }
}
