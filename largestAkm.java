public class largestAkm {
    //26
    public static void main(String[] args) {
        int a = 10, b = 25, c = 15;
        int larg;
        if (a >= b && a >= c) {
            larg = a;
        } else if (b >= a && b >= c) {
            larg = b;
        } else {
            larg = c;
        }
        System.out.println("Largest number is : " + larg);

    }
}
