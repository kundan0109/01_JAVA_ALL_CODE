package Class_Object.LambdaPractice.Home;

import java.util.function.Consumer;

//      Consumer method with any type input and no output using accept method

public class Consumer1 {

    public static void main(String[] args) {


//        interface Consumer<X>{
//            void accept(X x);
//        }

        Consumer<String> consumer = x -> System.out.println("Type is " + x);
        Consumer<Integer> consumer2 = x -> System.out.println("Type is " + x);


        consumer.accept("Kshitija");
        consumer2.accept(55);
    }
}
