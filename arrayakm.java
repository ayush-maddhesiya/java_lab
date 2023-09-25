import java.util.Scanner;
public class test{
    public static void main(String[] args) {
        //array declration 
        // int neeraj[]  = new int[3];
        // int[] Marks = new int[3];    


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[]  = new int[n];
        for(int i = 0 ; i < n  ; i++){
            int array[i] = sc.nextInt;
        }
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + " ");
        }
    }
}