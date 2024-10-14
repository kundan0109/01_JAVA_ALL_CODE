package Math_Problem.ASSIGNMENTS.OBJECTS_AND_CLASSES;

public class Student02 {
    String name;
    int rollNo;

    void sdt2(){
        this.name = "katy";
        this.rollNo = 12;
        System.out.println(this.name);
        System.out.println(this.rollNo);


    }

    public static void main(String[] args){
        Student02 obj = new Student02();
        obj.sdt2();
        obj.name = "john";
        obj.rollNo = 10;

        System.out.println(obj.rollNo);
        System.out.println(obj.name);


    }





}
