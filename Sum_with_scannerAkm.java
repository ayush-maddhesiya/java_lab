import java.util.Scanner;

public class Sum_with_scannerAkm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        System.out.print("Enter the first number: ");
        int i = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int j = scanner.nextInt();

        int sum = i + j;
        System.out.println("Sum is: " + sum);

        int difference = i - j;
        System.out.println("Difference: " + difference);

        int product = i * j;
        System.out.println("Product is: " + product);

    }
}
