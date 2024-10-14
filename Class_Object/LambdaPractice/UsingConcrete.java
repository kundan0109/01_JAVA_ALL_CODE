package Class_Object.LambdaPractice;

public class UsingConcrete {
    public static void main(String[] args) {
        class First {
            void m1(){}
        }

        class Second extends First{
            @Override
            void m1() {
                System.out.println("Traditional method with Concrete");
            }
        }
        First first = new Second();
        first.m1();


        First anonymsRef = new First(){
            @Override
            void m1() {
                System.out.println("Anonymous method to Concrete ");
            }
        };
        anonymsRef.m1();

    }

}
