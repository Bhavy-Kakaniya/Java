import java.util.Scanner;
public class metertofeet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter meters to convert in feet");
        int meter = sc.nextInt();
        double feet = meter * 3.28084;
        System.out.println(feet);
    }
}
