package Class_Object.LambdaPractice.Home;

public class Anonymous {
    public static void main(String[] args) {

        abstract class First {
            abstract void m1();
        }
        class Second extends First{
            @Override
            void m1() {
                System.out.println("Traditional method Of Anonymous class");
            }
        }
        First first = new Second();
        first.m1();

        First first1 = new First() {
            @Override
            void m1() {
                System.out.println("Anonymous method Of Anonymous class");
            }
        };

        first1.m1();

    }
}
