package Day2;

import java.util.Scanner;

public class Day2P3 {
    public static void main(String[] args) {
        matrixMultiply();
    }

    private static void matrixMultiply() {
        Scanner sc = new Scanner(System.in);

        // // Sample data
        // int[][] A = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // int[][] B = { { 7, 8 }, { 9, 5 }, { 5, 2 } };

        int[][] A = createMatrix(sc);
        int[][] B = createMatrix(sc);

        print(A);
        System.out.println();
        print(B);
        int[][] C = multiply(A, B);
        System.out.println();
        System.out.println();
        print(C);
        sc.close();
    }

    private static void print(int[][] c) {
        int rows = c.length;
        int cols = c[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] multiply(int[][] a, int[][] b) {
        int aRow = a.length;
        int aCol = a[0].length;
        int bRow = b.length;
        int bCol = b[0].length;

        if (aCol != bRow) {
            System.out.println("Multiplication not possible!");
            return null;
        }

        int[][] result = new int[aRow][bCol];
        for (int i = 0; i < aRow; i++) {
            for (int j = 0; j < bCol; j++) {
                for (int k = 0; k < aCol; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return result;
    }

    private static int[][] createMatrix(Scanner sc) {
        System.out.println("Enter m and n : ");

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] mat = new int[m][n];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        return mat;
    }
}
