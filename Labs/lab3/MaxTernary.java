import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        int d;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a : ");
        int a = sc.nextInt();
        System.out.println("enter b : ");
        int b = sc.nextInt();
        System.out.println("enter c : ");
        int c = sc.nextInt();
        d = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println(d);
    }
}
