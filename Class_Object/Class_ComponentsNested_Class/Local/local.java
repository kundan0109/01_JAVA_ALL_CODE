package Class_Object.Class_ComponentsNested_Class.Local;

public class local {

    public static void main(String[] args) {

        class LocalInnerClass{
            int k = 19;
            String name = " Kundan";

            void m1(){
                System.out.println("LocalInner Class");
            }
        }

        LocalInnerClass localInnerClass = new LocalInnerClass();
        System.out.println(localInnerClass.k);
        System.out.println(localInnerClass.name);
        localInnerClass.m1();
    }
}
