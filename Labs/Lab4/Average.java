// Write a program that creates and initializes a four integer element array. Calculate and display the average of its values
import java.util.Scanner;

public class _2average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.println("enter number " + (i + 1) + ":");
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }
        int avg = sum / n;
        System.out.println(avg);
    }
}
