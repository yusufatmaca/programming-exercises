import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of rows: ");
        int numberOfRows = input.nextInt();
        System.out.print("Please enter the number of columns: ");
        int numberOfColumns = input.nextInt();

        int[][] matrix = new int[numberOfRows][numberOfColumns];

        for (int rows = 0; rows < numberOfRows; rows++) {
            for (int columns = 0; columns < numberOfColumns; columns++) {
                System.out.print("Please enter the number for matrix[" + (rows + 1) + "][" + (columns + 1) + "]: ");
                matrix[rows][columns] = input.nextInt();
            }
        }

        int result = findLargestElement(matrix);
        System.out.println(result);

        printTwoDimensionalArray(matrix);

    }

    static int findLargestElement(int[][] matrix) {
        int largestElement = matrix[0][0];
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int columns = 0; columns < matrix[rows].length; columns++) {
                if (largestElement < matrix[rows][columns])
                    largestElement = matrix[rows][columns];
            }
        }
        return largestElement;
    }

    static void printTwoDimensionalArray(int[][] matrix) {
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int columns = 0; columns < matrix[rows].length; columns++) {
                System.out.print(matrix[rows][columns] + " ");
            }
            System.out.println();
        }
    }
}