package Math_Problem.ASSIGNMENTS.Methods;

public class RefrencePass {
    int id;
    String name;

    public static void main(String[] args) {
        RefrencePass refrencePass = new RefrencePass();
        refrencePass.id = 101;
        refrencePass.name = "kundan";
        changeData(refrencePass);
        System.out.println("original data : ");
        System.out.println(refrencePass.id);
        System.out.println(refrencePass.name);
    }

    private static void changeData(RefrencePass student) {
        student = new RefrencePass();
        student.id = 201;
        student.name = "nayan";
        System.out.println("Change Data: ");
        System.out.println(student.id);
        System.out.println(student.name);


    }
}
