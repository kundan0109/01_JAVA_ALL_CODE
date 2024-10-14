package Class_Object.LambdaPractice.Home;

public class FunctionalInterface {
    public static void main(String[] args) {

        @java.lang.FunctionalInterface
        interface First {
            abstract void m1();
        }
        class Second implements First{
            @Override
            public void m1() {
                System.out.println("Traditional method of Functional Interface");
            }
        }
        First first = new Second();
        first.m1();

        First first1 = new First() {
            @Override
            public void m1() {
                System.out.println("Anonymous method of Functional Interface");
            }
        };
        first1.m1();

        First first2Ref = () -> System.out.println("Lambda method of Functional Interface");
        first2Ref.m1();


    }
}
