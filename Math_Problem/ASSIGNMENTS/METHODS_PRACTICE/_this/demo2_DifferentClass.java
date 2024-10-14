package Math_Problem.ASSIGNMENTS.METHODS_PRACTICE._this;

public class demo2_DifferentClass {
    void m1(){
        System.out.println("m1");             //INSTANCE
    }
     static void m2(){
         System.out.println("m2");          //STATIC
     }



}



class demo002{

    public static void main(String[] args) {

        //INSTANCE CALL
        demo2_DifferentClass obj = new demo2_DifferentClass();
        obj.m1();

        //STATIC CALL

        demo2_DifferentClass.m2();
        obj.m2();           //you can call using refrence variable also to static variable


    }

}
