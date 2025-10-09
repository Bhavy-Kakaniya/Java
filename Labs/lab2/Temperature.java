import java.util.Scanner;

public class temperature {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter fahrenheit");
        int f = sc.nextInt();
        double c = (((f - 32) * 5) / (9.0));
        System.out.println(c);
    }
}
