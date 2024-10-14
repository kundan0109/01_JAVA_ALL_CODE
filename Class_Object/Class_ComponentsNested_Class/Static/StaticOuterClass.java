package Class_Object.Class_ComponentsNested_Class.Static;

public class StaticOuterClass {

    int InstanceOuterStaticVar = 22;
    static int StaticOuterVar = 656;

    static class Static01 {
        int instanceVar = 10;
        static int staticVar = 20;

        void m1() {
            System.out.println("Instance method");
        }

        static void m2() {
            System.out.println("Static method");
        }

    }


}
