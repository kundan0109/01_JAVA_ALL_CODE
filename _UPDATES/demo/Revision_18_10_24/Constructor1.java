package _UPDATES.demo.Revision_18_10_24;

public class Constructor1 {
    int id;
    String name;
    public Constructor1(){
//        new Constructor1(1, "pari");
//        this(11, "dhanu");
        this(12);
        System.out.println("Zero Parameterized");
        this.id = 1;
        this.name = "nayan";

    }

    public Constructor1(int id ){
        System.out.println("one parameterized constructor");
        this.id = id;
    }

    public Constructor1(int id , String name){
        System.out.println("parameterized constructor");
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Constructor1 constructor1 = new Constructor1();
        System.out.println(constructor1.id);
        System.out.println(constructor1.name);
    }
}
