import java.util.Scanner;

public class ScannerInputAkm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i ;
        System.out.println("Eenter interge : ");
        i = sc.nextInt();
        System.out.println("Interger is : " + i);

        float f ;
        System.out.println("Enter float : ");
        f = sc.nextFloat();
        System.out.println("Float : " + f);

        double d;
        System.out.println("Enter Double  : ");
        d = sc.nextFloat();
        System.out.println("Double  : " + d);
    }
}
