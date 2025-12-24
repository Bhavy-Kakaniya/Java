import java.util.*;

public class _18IntersectionOfArr {

    static void sortArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Array 1: ");
        int n1 = sc.nextInt();
        int num1[] = new int[n1];
        System.out.println("Enter elements of Array 1:");
        for (int i = 0; i < n1; i++) {
            num1[i] = sc.nextInt();
        }

        System.out.print("Enter size of Array 2: ");
        int n2 = sc.nextInt();
        int num2[] = new int[n2];
        System.out.println("Enter elements of Array 2:");
        for (int i = 0; i < n2; i++) {
            num2[i] = sc.nextInt();
        }

        // Sort both arrays
        sortArray(num1);
        sortArray(num2);

        // Find intersection
        int intersection[] = new int[n1 + n2];
        int i = 0, j = 0, index = 0;
        while (i < n1 && j < n2) {
            if (num1[i] == num2[j]) {
                intersection[index] = num1[i];
                index++;
                i++;
                j++;
            } else if (num1[i] < num2[j]) {
                i++;
            } else {
                j++;
            }
        }

        // Print intersection
        System.out.print("Intersection: ");
        for (int k = 0; k < intersection.length - 1; k++) {
            System.out.print(intersection[k] + " ");
        }
    }
}
