package Math_Problem.ASSIGNMENTS.CLASS.Class_Components;

public class College_Class {
    public static void main(String[] args) {

        College_id nikita = new College_id();
        System.out.println(nikita);

        nikita .id = 123;
        nikita.branch = "CSE";
        nikita.name = "Arti Chaple";
        nikita.college = "CCEMN";

        System.out.println(nikita.college);
        System.out.println(nikita.id);
        System.out.println(nikita.branch);
        System.out.println(nikita.name);



    }
}
