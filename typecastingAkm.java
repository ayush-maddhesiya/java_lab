public class typecastingAkm {
    public static void main(String[] args) {
        int intNumber = 100;
        long longNumber = intNumber; 
        float floatNumber = longNumber; 
        double doubleNumber = floatNumber; 
        System.out.println("Implicit Type Casting (Widening):");
        System.out.println("intNumber: " + intNumber);
        System.out.println("longNumber: " + longNumber);
        System.out.println("floatNumber: " + floatNumber);
        System.out.println("doubleNumber: " + doubleNumber);
        
        double explicitDouble = 123.456;
        float explicitFloat = (float) explicitDouble; 
        long explicitLong = (long) explicitFloat; 
        int explicitInt = (int) explicitLong; 

        System.out.println("\nExplicit Type Casting (Narrowing):");
        System.out.println("explicitDouble: " + explicitDouble);
        System.out.println("explicitFloat: " + explicitFloat);
        System.out.println("explicitLong: " + explicitLong);
        System.out.println("explicitInt: " + explicitInt);
    }
}
