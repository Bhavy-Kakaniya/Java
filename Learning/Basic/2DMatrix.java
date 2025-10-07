import java.util.Scanner;

public class MatrixInput {
    public static void main(String[] args) {
        // Create a 2x2 matrix
        int[][] matrix = new int[2][2];

        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter values for the matrix
        System.out.println("Enter the elements of a 2x2 matrix:");

        // Input values for the matrix
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Print the matrix
        System.out.println("\nThe 2x2 matrix is:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
