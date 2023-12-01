import java.util.Scanner;

public class ArraysAkm{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the element to be searched: ");
        int searchElement = scanner.nextInt();
        int index = linearSearch(arr, searchElement);
        if (index != -1) {
            System.out.println("Element found at index: " + (index+1));
        } else {
            System.out.println("Element not found in the array.");
        }
        scanner.close();
    }

    // Function to perform linear search in an array
    private static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;

    }
}
