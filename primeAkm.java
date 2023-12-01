public class primeAkm {
    public static void main(String[] args) {
        int n = 10; 

        System.out.println("First " + n + " prime numbers:");

        int count = 0; 
        int number = 2; 

        while (count < n) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }
    private static boolean isPrime(int num) {
        if(num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
