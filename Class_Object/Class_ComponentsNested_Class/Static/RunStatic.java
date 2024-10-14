package Class_Object.Class_ComponentsNested_Class.Static;

public class RunStatic {
    public static void main(String[] args) {

        System.out.println(StaticOuterClass.StaticOuterVar);

        System.out.println(StaticOuterClass.Static01.staticVar);
        StaticOuterClass.Static01.m2();
    }
}
