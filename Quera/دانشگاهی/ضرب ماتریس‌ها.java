import java.util.Scanner;

public class Main {

    // Scanner Object
    static Scanner Scan = new Scanner(System.in);

    public static void main(String[] args) {

        int numberOne = Scan.nextInt();
        int numberTwo = Scan.nextInt();
        int numberThree =  Scan.nextInt();

        int[][] MatrixOne = new int[numberOne][numberTwo];
        int[][] MatrixTwo = new int [numberTwo][numberThree];

        // Initialize MatrixOne
        for (int i = 0 ; i < numberOne ; i++)
            for (int j = 0 ; j < numberTwo ; j++)
                MatrixOne[i][j] = Scan.nextInt();

        // Initialize MatrixTwo
        for (int i = 0 ; i < numberTwo ; i++)
            for (int j = 0 ; j < numberThree ; j++)
                MatrixTwo[i][j] = Scan.nextInt();

        // Print Result
        int[][] result = multiplicar(MatrixOne, MatrixTwo);
        for (int i = 0 ; i < numberOne ; i++) {
            for (int j = 0 ; j < numberThree ; j++)
                System.out.print(result[i][j] + " ");
            System.out.println();
        }
    }

    public static int[][] multiplicar(int[][] A, int[][] B) {

        int aRows = A.length;
        int aColumns = A[0].length;
        int bRows = B.length;
        int bColumns = B[0].length;

        if (aColumns != bRows) {
            throw new IllegalArgumentException("A:Rows: " + aColumns + " did not match B:Columns " + bRows + ".");
        }

        int[][] C = new int[aRows][bColumns];
        for (int i = 0; i < aRows; i++) {
            for (int j = 0; j < bColumns; j++) {
                C[i][j] = 0;
            }
        }

        for (int i = 0; i < aRows; i++) { // aRow
            for (int j = 0; j < bColumns; j++) { // bColumn
                for (int k = 0; k < aColumns; k++) { // aColumn
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return C;
    }
}