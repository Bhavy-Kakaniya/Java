import java.util.Scanner;

public class primerange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number : ");
        int a = sc.nextInt();
        System.out.println("enter second number : ");
        int b = sc.nextInt();
        while (a < b) {
            int count = 0;
            int i = 1;
            while (i <= a) {
                if (a % i == 0) {
                    count++;
                }
                i++;
            }
            if (count == 2) {
                System.out.print(a + " ");
            }
            a++;
        }
    }
}
