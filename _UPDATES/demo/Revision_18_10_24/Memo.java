package _UPDATES.demo.Revision_18_10_24;

interface InnerClass {

    void m1();

    void m2();

    default void m3() {
        System.out.println("m3 of Interface");
    }
}

// interface B extends InnerClass{
//
//}

class C implements InnerClass{

    @Override
    public void m1() {
        System.out.println("m1 of C class");
    }

    @Override
    public void m2() {
        System.out.println("m2 of C class");
    }
}

public class Memo{
    public static void main(String[] args) {
InnerClass innerClass = new C();
innerClass.m1();
innerClass.m2();
innerClass.m3();

    }
}

