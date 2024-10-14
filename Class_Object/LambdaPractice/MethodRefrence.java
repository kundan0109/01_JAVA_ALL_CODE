package Class_Object.LambdaPractice;

public class MethodRefrence {
    public static void main(String[] args) {


        interface First {
            void m1();
        }
        First first = () -> System.out.println("method Refrence ");
        first.m1();
    }

}

