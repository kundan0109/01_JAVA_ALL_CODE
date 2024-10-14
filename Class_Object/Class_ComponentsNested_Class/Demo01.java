package Class_Object.Class_ComponentsNested_Class;

public class Demo01 {
    int id;
    String name;
    public Demo01(){
        System.out.println("Zero parameterized");
    }

    public Demo01(int x){
        Dem dem = new Dem();
        System.out.println(x);
        System.out.println("parameterized constructor");
    }
    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
        System.out.println("main method");
        Demo01 demo02 = new Demo01(5);
        Dem.m55(66);
    }
}

class Dem {

    Dem(){
        System.out.println("Dem zero COnstructor");
    }
    static void m55(int k ){
        Demo01 demo01 = new Demo01(k);

    }

}
