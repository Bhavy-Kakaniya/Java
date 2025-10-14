import java.util.Scanner;

public class _03RotateArray {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter pivot index: ");
        int k = sc.nextInt();

        System.out.print("Rotated array: ");
        for (int i = k; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
