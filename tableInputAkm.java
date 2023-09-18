import java.util.Scanner;

public class tableInputAkm {
    //30
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the of  number which you want table : ");
        int  n = sc.nextInt();
        System.out.println("Enter the number till which you want table : ");
        int  nn = sc.nextInt();
        for (int i = 0; i <= nn ; i++) {
            System.out.println(n + " * " + i + " = " + i*n);
        }
    }
}
