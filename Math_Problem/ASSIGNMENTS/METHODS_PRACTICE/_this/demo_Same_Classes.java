package Math_Problem.ASSIGNMENTS.METHODS_PRACTICE._this;

public class demo_Same_Classes {
    public static void main(String[] args) {//STATIC

//        demo_01.m2();
        demo_Same_Classes obj = new demo_Same_Classes();
//        obj.m1();
        obj.m3();

        m2();
        obj.m2();
//

    }

    void m1(){                                      //INSTANCE
        System.out.println("m1 instance");
    }

    static void m2(){
        System.out.println("m2 instance ");
    }

    void m3(){
        this.m1();
    }


}

