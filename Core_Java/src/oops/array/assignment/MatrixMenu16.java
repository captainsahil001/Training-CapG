package oops.array.assignment;

import java.util.*;

public class MatrixMenu16 {

    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            printMenu();
            int ch = readInt("Enter choice (1-16) or 0 to exit: ");

            if (ch == 0) {
                System.out.println("Bye!");
                break;
            }

            try {
                switch (ch) {
                    case 1 -> q1_LargestSmallest2D();
                    case 2 -> q2_AddMatrices();
                    case 3 -> q3_MultiplyMatrices();
                    case 4 -> q4_Transpose();
                    case 5 -> q5_Identity();
                    case 6 -> q6_Diagonals();
                    case 7 -> q7_Boundary();
                    case 8 -> q8_Spiral();
                    case 9 -> q9_UpperTriangular();
                    case 10 -> q10_LowerTriangular();
                    case 11 -> q11_MatricesEqual();
                    case 12 -> q12_Trace();
                    case 13 -> q13_SearchSortedMatrix();
                    case 14 -> q14_Rotate90Clockwise();
                    case 15 -> q15_SaddlePoint();
                    case 16 -> q16_CountZerosBinaryMatrix();
                    default -> System.out.println("Invalid choice!");
                }
            } catch (Exception e) {
                System.out.println("Input error!");
                sc.nextLine();
            }

            System.out.println("\nPress Enter to continue");
            sc.nextLine();
        }
    }

    static void printMenu() {
        System.out.println("""
        1. Largest & Smallest elements
        2. Add matrices
        3. Multiply matrices
        4. Transpose matrix
        5. Identity matrix
        6. Diagonals
        7. Boundary elements
        8. Spiral order
        9. Upper triangular
        10. Lower triangular
        11. Equal matrices
        12. Trace
        13. Search sorted matrix
        14. Rotate 90 degree clockwise
        15. Saddle point
        16. Count zeros in binary matrix
        0. Exit
        """);
    }

    static int readInt(String msg) {
        System.out.print(msg);
        while (!sc.hasNextInt()) sc.next();
        int x = sc.nextInt();
        sc.nextLine();
        return x;
    }

    static int[][] readMatrix(int r, int c) {
        int[][] a = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = readInt("");
        return a;
    }

    static void printMatrix(int[][] a) {
        for (int[] row : a) {
            for (int x : row) System.out.print(x + " ");
            System.out.println();
        }
    }

    static void q1_LargestSmallest2D() {
        int r = readInt("Rows: ");
        int c = readInt("Cols: ");
        int[][] a = readMatrix(r, c);

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int[] row : a)
            for (int x : row) {
                min = Math.min(min, x);
                max = Math.max(max, x);
            }

        System.out.println("Smallest = " + min);
        System.out.println("Largest = " + max);
    }

    static void q2_AddMatrices() {
        int r = readInt("Rows: ");
        int c = readInt("Cols: ");
        int[][] A = readMatrix(r, c);
        int[][] B = readMatrix(r, c);

        int[][] S = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                S[i][j] = A[i][j] + B[i][j];

        printMatrix(S);
    }

    static void q3_MultiplyMatrices() {
        int r1 = readInt("A rows: ");
        int c1 = readInt("A cols: ");
        int[][] A = readMatrix(r1, c1);

        int r2 = readInt("B rows: ");
        int c2 = readInt("B cols: ");
        int[][] B = readMatrix(r2, c2);

        if (c1 != r2) {
            System.out.println("Not possible");
            return;
        }

        int[][] C = new int[r1][c2];
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c2; j++)
                for (int k = 0; k < c1; k++)
                    C[i][j] += A[i][k] * B[k][j];

        printMatrix(C);
    }

    static void q4_Transpose() {
        int r = readInt("Rows: ");
        int c = readInt("Cols: ");
        int[][] A = readMatrix(r, c);

        for (int j = 0; j < c; j++) {
            for (int i = 0; i < r; i++)
                System.out.print(A[i][j] + " ");
            System.out.println();
        }
    }

    static void q5_Identity() {
        int n = readInt("Order: ");
        int[][] A = readMatrix(n, n);

        boolean ok = true;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if ((i == j && A[i][j] != 1) || (i != j && A[i][j] != 0))
                    ok = false;

        System.out.println(ok ? "Identity Matrix" : "Not Identity Matrix");
    }

    static void q6_Diagonals() {
        int n = readInt("Order: ");
        int[][] A = readMatrix(n, n);

        for (int i = 0; i < n; i++) System.out.print(A[i][i] + " ");
        System.out.println();
        for (int i = 0; i < n; i++) System.out.print(A[i][n - 1 - i] + " ");
        System.out.println();
    }

    static void q7_Boundary() {
        int r = readInt("Rows: ");
        int c = readInt("Cols: ");
        int[][] A = readMatrix(r, c);

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i == 0 || i == r - 1 || j == 0 || j == c - 1)
                    System.out.print(A[i][j] + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    static void q8_Spiral() {
        int r = readInt("Rows: ");
        int c = readInt("Cols: ");
        int[][] A = readMatrix(r, c);

        int top = 0, bottom = r - 1, left = 0, right = c - 1;
        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++) System.out.print(A[top][j] + " ");
            top++;
            for (int i = top; i <= bottom; i++) System.out.print(A[i][right] + " ");
            right--;
            if (top <= bottom)
                for (int j = right; j >= left; j--) System.out.print(A[bottom][j] + " ");
            bottom--;
            if (left <= right)
                for (int i = bottom; i >= top; i--) System.out.print(A[i][left] + " ");
            left++;
        }
        System.out.println();
    }

    static void q9_UpperTriangular() {
        int n = readInt("Order: ");
        int[][] A = readMatrix(n, n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(j < i ? "0 " : A[i][j] + " ");
            System.out.println();
        }
    }

    static void q10_LowerTriangular() {
        int n = readInt("Order: ");
        int[][] A = readMatrix(n, n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(j > i ? "0 " : A[i][j] + " ");
            System.out.println();
        }
    }

    static void q11_MatricesEqual() {
        int r = readInt("Rows: ");
        int c = readInt("Cols: ");
        int[][] A = readMatrix(r, c);
        int[][] B = readMatrix(r, c);

        boolean same = true;
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                if (A[i][j] != B[i][j]) same = false;

        System.out.println(same ? "Equal" : "Not Equal");
    }

    static void q12_Trace() {
        int n = readInt("Order: ");
        int[][] A = readMatrix(n, n);
        int trace = 0;
        for (int i = 0; i < n; i++) trace += A[i][i];
        System.out.println("Trace = " + trace);
    }

    static void q13_SearchSortedMatrix() {
        int r = readInt("Rows: ");
        int c = readInt("Cols: ");
        int[][] A = readMatrix(r, c);
        int key = readInt("Key: ");

        int i = 0, j = c - 1;
        while (i < r && j >= 0) {
            if (A[i][j] == key) {
                System.out.println("Found at (" + i + "," + j + ")");
                return;
            }
            if (A[i][j] > key) j--;
            else i++;
        }
        System.out.println("Not found");
    }

    static void q14_Rotate90Clockwise() {
        int n = readInt("Order: ");
        int[][] A = readMatrix(n, n);

        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++) {
                int t = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = t;
            }

        for (int i = 0; i < n; i++)
            for (int l = 0, r = n - 1; l < r; l++, r--) {
                int t = A[i][l];
                A[i][l] = A[i][r];
                A[i][r] = t;
            }

        printMatrix(A);
    }

    static void q15_SaddlePoint() {
        int r = readInt("Rows: ");
        int c = readInt("Cols: ");
        int[][] A = readMatrix(r, c);

        boolean found = false;
        for (int i = 0; i < r; i++) {
            int min = A[i][0], col = 0;
            for (int j = 1; j < c; j++)
                if (A[i][j] < min) {
                    min = A[i][j];
                    col = j;
                }

            boolean isMax = true;
            for (int k = 0; k < r; k++)
                if (A[k][col] > min) isMax = false;

            if (isMax) {
                System.out.println("Saddle Point = " + min);
                found = true;
            }
        }
        if (!found) System.out.println("No saddle point");
    }

    static void q16_CountZerosBinaryMatrix() {
        int r = readInt("Rows: ");
        int c = readInt("Cols: ");
        int[][] A = readMatrix(r, c);

        int zeros = 0;
        for (int[] row : A)
            for (int x : row)
                if (x == 0) zeros++;

        System.out.println("Zero count = " + zeros);
    }
}

