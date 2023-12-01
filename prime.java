import java.util.Scanner;
class Main 
{
    static void prime(int number)
    {
        for(int i = 2; i < number ; i++)
        {
          if(number % i == 0)
          {
              System.out.println("prime ");
          }
          else{
              System.out.println(" not prime ");
          }
        }
        
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        prime(n);
        
    }
    
}
