import java.util.Scanner;

/**
 * MatrixOperationsApp - Performs basic matrix math
 * * @author Developer
 * @version 1.0
 */
public class MatrixOperationsApp {

    // Method to create a random matrix with specified rows and columns
    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 10); // Random values 0-9
            }
        }
        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrixA, int[][] matrixB, int rows, int cols) {
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return result;
    }

    // Method to display a matrix in tabular format
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rows = 3, cols = 3;
        
        int[][] matrix1 = createRandomMatrix(rows, cols);
        int[][] matrix2 = createRandomMatrix(rows, cols);
        
        System.out.println("Matrix A:");
        displayMatrix(matrix1);
        
        System.out.println("\nMatrix B:");
        displayMatrix(matrix2);
        
        int[][] sumMatrix = addMatrices(matrix1, matrix2, rows, cols);
        System.out.println("\nSum of A and B:");
        displayMatrix(sumMatrix);
    }
}