package Class_Problem.Class_Components;

public class College_Class {
    int id;
    String branch;
    String name;
    String college;


    public static void main(String[] args) {

        College_id nikita = new College_id();
        System.out.println(nikita);

        System.out.println(nikita.college);
        System.out.println(nikita.id);
        System.out.println(nikita.branch);
        System.out.println(nikita.name);

        nikita.id = 123;
        nikita.branch = "CSE";
        nikita.name = "Arti Chaple";
        nikita.college = "CCEMN";

        System.out.println(nikita.college);
        System.out.println(nikita.id);
        System.out.println(nikita.branch);
        System.out.println(nikita.name);

        ////////////////////////////////////////////////////////////


       /* College_Class ref = new College_Class();
        System.out.println(ref.id);
        ref.id = 10;
        System.out.println("id" + ref.id);
        System.out.println("breanch " + ref.branch);
        ref.branch = "cse ";
        System.out.println("breanch " + ref.branch);*/


    }
}
