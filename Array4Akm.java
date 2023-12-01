import java.util.Scanner;

public class Array4Akm {
    public static void main(String[] args){
        System.out.println("Enter the size of array.");
        Scanner dc  = new Scanner(System.in);
        int size = dc.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the element one by one .");
        for (int i = 0; i < size; i++) {
            array[i] = dc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
