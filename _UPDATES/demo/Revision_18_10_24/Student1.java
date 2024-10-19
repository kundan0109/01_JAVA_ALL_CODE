package _UPDATES.demo.Revision_18_10_24;

public class Student1 {
    static {
        System.out.println("Static Block");
    }
    {
        System.out.println("Instacnde Block");
    }
    Student1(){
        System.out.println("Zero Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
        Student1 student1 = new Student1();
    }
}
