package Class_Object.LambdaPractice;

public class UsingInterface {
    public static void main(String[] args) {

        interface First{
            void m1();
            void m2();
        }
        class Second implements First{
            @Override
            public void m1() {
                System.out.println("Traditional way for interface class m1 ");
            }
            @Override
            public void m2() {
                System.out.println("Traditional way for interface class m2 ");
            }
        }
        First first = new Second();
        first.m1();
        first.m2();

        First AnonymousRef = new First() {
            @Override
            public void m1() {
                System.out.println("Anonymous way for interface class m1 ");
            }
            @Override
            public void m2() {
                System.out.println("Anonymous way for interface class m2 ");
            }
        };
        AnonymousRef.m1();
        AnonymousRef.m2();




    }
}
