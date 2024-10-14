package Class_Object.LambdaPractice;

public class UsingFunctionalInterface {
    public static void main(String[] args) {
        @FunctionalInterface
        interface First{
            void m1();
        }
        class Seccond implements First{
            @Override
            public void m1() {
                System.out.println("Traditional way for Functional interface class m1 ");
            }
        }
        First first = new Seccond();
        first.m1();

        First AnonymsRef = new First() {
            @Override
            public void m1() {
                System.out.println("Anonymous way for Functional Interface class");
            }
        };
        AnonymsRef.m1();

        First firstRefLambda = ( ) -> System.out.println("Lambda Expression way for Functional interface class m1 ");
        firstRefLambda.m1();






    }
}
