package Math_Problem.ASSIGNMENTS.METHODS_Assignment;

class Student {
    // Data members
    private String name;
    private int age;
    private String address;

    // Constructor with default values
    public Student() {
        this.name = "unknown";
        this.age = 0;
        this.address = "not available";
    }

    // Method to set name and age
    public void setInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to set name, age, and address
    public void setInfo(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Method to print student details
    public void printInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Address: " + address);
    }
}

public class Main {
    public static void main(String[] args) {
        // Array of 10 Student objects
        Student[] students = new Student[10];

        // Initializing the student objects
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
        }

        // Setting information for some students
        students[0].setInfo("Alice", 20);
        students[1].setInfo("Bob", 22, "123 Street, City");
        students[2].setInfo("Charlie", 21);
        students[3].setInfo("David", 23, "456 Avenue, City");
        students[4].setInfo("Eva", 19);
        students[5].setInfo("Frank", 24, "789 Boulevard, City");

        // Printing information of all students
        for (Student student : students) {
            student.printInfo();
        }
    }
}
