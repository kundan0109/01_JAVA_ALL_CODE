package Class_Object.LambdaPractice.Home;

public class FunctionalInterface4Methods {
    public static void main(String[] args) {

        interface First01{
            void m1();
        }
        First01 FirstRef = () -> System.out.println("First method ");
        FirstRef.m1();

        interface Second{
            void m1(int k);
        }
        Second second = (k) -> System.out.println("Second Method of Lambda mehthod ");
        second.m1(5);

//        interface Third{
//            int m1();
//        }
//        Third third = () -> System.out.println(return 55;);
//        third.m1();

        interface Fourth{
            int m1(int k);
        }
        Fourth fourth = (k -> { return k*k;});
        fourth.m1(5);



    }
}
