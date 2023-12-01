import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        // to find SI;


        Scanner sc  = new Scanner(System.in);
        System.out.println("enter principal : ");
        float p = sc.nextFloat();
        System.out.println("Enter rate : ");
        float rate = sc.nextFloat();
        System.out.println("Enter Time ");
        float time = sc.nextFloat();

        float amount ;
        amount = p*(rate/100)*time;

        System.out.println("Total amount you earn as profit is : " + amount);


    }
}
