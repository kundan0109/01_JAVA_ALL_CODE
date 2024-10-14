package Class_Object.LambdaPractice.Home;

public class Interface {
    public static void main(String[] args) {

        interface First{
            void m1();
        }
        class Second implements First{
            @Override
            public void m1() {
                System.out.println("Interface Traditional method");
            }
        }
        First first = new Second();
        first.m1();

        First first1 = new First() {
            @Override
            public void m1() {
                System.out.println("Anonymous method of Interface");
            }
        };
        first1.m1();


    }
}
