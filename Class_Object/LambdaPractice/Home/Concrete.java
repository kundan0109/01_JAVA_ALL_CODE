package Class_Object.LambdaPractice.Home;

public class Concrete {
    public static void main(String[] args) {

        class Concrete1{
            void m1(){}
        }
        class Second extends Concrete1{
            @Override
            void m1() {
                System.out.println("Concrete Traditional Method");
            }
        }
        Concrete1 concrete1 = new Second();
        concrete1.m1();

        Concrete1 concrete11 = new Concrete1(){
            @Override
            void m1() {
                System.out.println("Concrete class Anonymous method ");
            }
        };



    }
}
