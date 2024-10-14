package Class_Object.Class_ComponentsNested_Class.Inner;

public class test {
    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println(outer.a);
        outer.m1();


        Outer.Inner inner = outer.new Inner();
        inner.m2();
        System.out.println(inner.b);

    }

}
