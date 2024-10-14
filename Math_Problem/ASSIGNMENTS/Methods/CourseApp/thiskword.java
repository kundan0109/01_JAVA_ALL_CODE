package Math_Problem.ASSIGNMENTS.Methods.CourseApp;

public class thiskword {

    int x = 10;
    int y = 20;
    static String name = " kundan";
    void m1(int x, int y){

        System.out.println(x);
        System.out.println(y);
        System.out.println(name);
        System.out.println(this.x);
        System.out.println(this.y);
        System.out.println(this.name);
        System.out.println(thiskword.name);
        System.out.println(thiskword.this.x);
        System.out.println(thiskword.this.y);

    }

    public static void main(String[] args) {
        thiskword thiskword = new thiskword();
        thiskword.m1(55, 66);
    }
}
