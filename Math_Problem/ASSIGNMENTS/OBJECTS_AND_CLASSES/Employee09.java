package Math_Problem.ASSIGNMENTS.OBJECTS_AND_CLASSES;

public class Employee09 {
    String name ;
    int year;
    String address;

    public static void main(String[] args) {

        Employee09 obj = new Employee09();
        obj.id01();
        Employee09.m1();

    }

    private  void id01() {
        this.name = "katrina";
        this.year = 1999;
        this.address = "London";
        System.out.println(this.name + "\t " + this.year + "    "  + this.address);
    }

    public static void m1(){

    }

}
