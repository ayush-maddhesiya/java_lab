import java.util.Scanner;

class objectAkm {
    String name;
    int age;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    void updateInfo(String newName, int newAge) {
        name = newName;
        age = newAge;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        objectAkm myObject = new objectAkm();

        System.out.print("Enter name: ");
        myObject.name = scanner.nextLine();

        System.out.print("Enter age: ");
        myObject.age = scanner.nextInt();

        System.out.println("\nObject Information:");
        myObject.displayInfo();

        System.out.println("\nEnter new information:");

        System.out.print("Enter new name: ");
        String newName = scanner.next();

        System.out.print("Enter new age: ");
        int newAge = scanner.nextInt();

        myObject.updateInfo(newName, newAge);

        // Display updated information
        System.out.println("\nUpdated Information:");
        myObject.displayInfo();

        // Close the scanner
        scanner.close();
    }
}
