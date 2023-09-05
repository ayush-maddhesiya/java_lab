class CommandLineInputAkm
{
    public static void main(String args[])
    {
    int a,b,c;
       // System.out.println("Enter a and b : ");
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = a+b;

        System.out.println("Sum of " + a + " and " + b + " is : " + c);
    }
}
