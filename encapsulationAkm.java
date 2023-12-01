class Student {
    // Private member variables
    private String name;
    private int age;
    private double gpa;

    // Public constructor
    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    // Getter methods to access private variables
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    // Setter methods to modify private variables
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}

public class encapsulationAkm {
    public static void main(String[] args) {
        // Create an object of the Student class
        Student student = new Student("John Doe", 20, 3.75);

        // Accessing private variables using getter methods
        System.out.println("Student Information:");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("GPA: " + student.getGpa());

        // Modifying private variables using setter methods
        student.setName("Jane Doe");
        student.setAge(22);
        student.setGpa(3.90);

        // Display updated information
        System.out.println("\nUpdated Student Information:");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("GPA: " + student.getGpa());
    }
}
