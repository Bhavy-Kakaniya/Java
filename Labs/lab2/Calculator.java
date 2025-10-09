import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number : ");
        int a = sc.nextInt();
        System.out.println("enter operation : ");
        char ch = sc.next().charAt(0);
        System.out.println("enter second number : ");
        int b = sc.nextInt();
        if (ch == '+') {
            int sum = a + b;
            System.out.println(sum);
        } else if (ch == '-') {
            int diff = a - b;
            System.out.println(diff);
        } else if (ch == '*') {
            int product = a * b;
            System.out.println(product);
        } else {
            float div = a / b;
            System.out.println(div);
        }
    }
}
