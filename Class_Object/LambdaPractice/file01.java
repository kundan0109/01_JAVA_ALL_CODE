package Class_Object.LambdaPractice;
class Main{
    public static void main(String[] args) {
        @FunctionalInterface
        interface Outer {
            void m1();

            default void m2(){
                System.out.println("Default method ");
            }
        }
        Outer ref = () -> System.out.println("hello ");

        ref.m1();
        ref.m2();

    }
}