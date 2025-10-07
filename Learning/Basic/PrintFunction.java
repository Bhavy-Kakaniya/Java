import java.util.Scanner;

public class printf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1 : ");
        int a = sc.nextInt();
        System.out.println("enter number 2 : ");
        int b = sc.nextInt();
        int sum = a + b ;
        System.out.printf("sum of %d and %d is %d",a,b,sum);
        //same can be done with format
        System.out.format("sum of %d and %d is %d",a,b,sum);
    }
}
