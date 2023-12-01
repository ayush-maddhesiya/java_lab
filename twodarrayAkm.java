import java.util.Scanner;

public class twodarrayAkm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][] twoDArray = new int[rows][columns];

        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element at position (" + i + ", " + j + "): ");
                twoDArray[i][j] = scanner.nextInt();
            }
        }
        System.out.println("2D Array:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println(); 
        }

        scanner.close();
    }
}
