public class cliAkm {
    public static void main(String[] args) {
       
        // Parse command line arguments for different data types
        int intValue = Integer.parseInt(args[0]);
        float floatValue = Float.parseFloat(args[1]);
        char charValue = args[2].charAt(0);
        double doubleValue = Double.parseDouble(args[3]);
        String stringValue = args[4];

        // Display the values
        System.out.println("Integer Value: " + intValue);
        System.out.println("Float Value: " + floatValue);
        System.out.println("Char Value: " + charValue);
        System.out.println("Double Value: " + doubleValue);
        System.out.println("String Value: " + stringValue);
    }
}
