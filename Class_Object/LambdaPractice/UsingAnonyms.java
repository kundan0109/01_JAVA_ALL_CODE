package Class_Object.LambdaPractice;

public class UsingAnonyms {
    public static void main(String[] args) {

        abstract class First {
            abstract void m1();
        }
        class Second extends First {
            @Override
            void m1() {
                System.out.println("Traditional way for Abstract class");
            }
        }

        First first = new Second();
        first.m1();

        First anonymsRef = new First() {
            @Override
            void m1() {
                System.out.println("Anonymous Class way for Abstract class");
            }
        };
        anonymsRef.m1();

    }
}
