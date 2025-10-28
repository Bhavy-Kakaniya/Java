import java.util.Scanner;

class RowSumThread extends Thread {
    private int[] row;
    private int rowIndex;
    private int sum;

    public RowSumThread(int[] row, int rowIndex) {
        this.row = row;
        this.rowIndex = rowIndex;
    }

    public void run() {
        sum = 0;
        for (int value : row) {
            sum += value;
        }
        System.out.println("Sum of row " + rowIndex + " = " + sum);
    }
}

public class MatrixRowSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows (m): ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns (n): ");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        System.out.println("Enter elements of matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        RowSumThread[] threads = new RowSumThread[m];
        for (int i = 0; i < m; i++) {
            threads[i] = new RowSumThread(matrix[i], i);
            threads[i].start();
        }

      for (int i = 0; i < m; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e);
            }
        }

        sc.close();
    }
}
