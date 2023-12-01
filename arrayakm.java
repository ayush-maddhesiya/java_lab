import java.util.Scanner;

public class arrayAkm {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input elements for the array
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();arrayakm.java:3: error: class arrayAkm is public, should be declared in a file named arrayAkm.java
public class arrayAkm {
       ^
        }

        // Input the element to be searched
        System.out.print("Enter the element to be searched: ");
        int searchElement = scanner.nextInt();

        // Perform linear search and print the result
        int index = linearSearch(arr, searchElement);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }

        // Close the scanner
        scanner.close();
    }

    // Function to perform linear search in an array
    private static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index if the element is found
            }
        }
        return -1; // Return -1 if the element is not found
    }
}
