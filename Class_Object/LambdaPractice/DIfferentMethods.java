package Class_Object.LambdaPractice;

public class DIfferentMethods {
    public static void main(String[] args) {

        interface First {
            void m1();
        }
        First first = () ->System.out.println("First no input no output ");
        first.m1();


        interface Second {
            String m2();
        }
        Second second = () -> {
          return   "kk";
        };
        second.m2();

        interface Third{
            void m3(int x);
        }
        Third third = (x -> System.out.println("Integer Input"));
        third.m3(5);


        interface Fourth{
            int m4(int k);
        }
        Fourth fourth = (k -> k);
        fourth.m4(55);


    }
}
