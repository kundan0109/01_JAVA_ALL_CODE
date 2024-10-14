package Class_Object.LambdaPractice.Home;

import java.util.function.Supplier;

//      Supplier no input but any type of output with get method

public class Suppilier1 {

    public static void main(String[] args) {

//        interface Suppilier<X>{
//            X get();
//        }

        Supplier<String> suppilier = () -> "String Suppilier";
        Supplier<Integer> suppilier1 = () -> 100;
        System.out.println(suppilier.get());
        System.out.println(suppilier1.get());
    }
}
