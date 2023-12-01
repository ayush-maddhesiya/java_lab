import java.util.Scanner;

public class InputByUserAkm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second number : ");
        int num2 = sc.nextInt();

        int sum;
        sum = num1 + num2;

        System.out.println("Sum : " + sum);

        int sub;
        sub = num1 - num2;
        System.out.println("Difference : " + sub);

        int mux;
        mux = num1 * num2 ;
        System.out.println("Multiply : " + mux);

        int div ;
        div = num1 /num2;
        System.out.println("Divide : " + div);


    }
}
