import java.util.Scanner;

public class result {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks of subject 1 : ");
        int a = sc.nextInt();
        System.out.println("enter marks of subject 2 : ");
        int b = sc.nextInt();
        System.out.println("enter marks of subject 3 : ");
        int c = sc.nextInt();
        System.out.println("enter marks of subject 4 : ");
        int d = sc.nextInt();
        System.out.println("enter marks of subject 5 : ");
        int e = sc.nextInt();
        int total_marks = a + b + c + d + e;
        double percentage = (total_marks / 500.0) * 100;
        System.out.println(percentage);
        if (percentage >= 60) {
            System.out.println("first division");
        } else if ((percentage >= 50) || (percentage <= 59)) {
            System.out.println("second division");
        } else if ((percentage >= 40) || (percentage <= 49)) {
            System.out.println("third division");
        } else if ((percentage < 40)) {
            System.out.println("fail");
        }
    }
}
