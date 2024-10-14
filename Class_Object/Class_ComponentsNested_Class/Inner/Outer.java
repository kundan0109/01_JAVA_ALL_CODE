package Class_Object.Class_ComponentsNested_Class.Inner;

public class Outer {
    int a = 10;

    void m1() {
        System.out.println("outer method");

    }

    class Inner {

        int b = 20;

        void m2() {
            System.out.println("inner method");
        }

    }
}
