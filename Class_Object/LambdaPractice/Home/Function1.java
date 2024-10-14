package Class_Object.LambdaPractice.Home;

import java.util.function.Function;

//  FUNCTION is input + output both with apply method

public class Function1 {
    public static void main(String[] args) {

//        interface Function<T, R>{
//            R apply  (T t);
//        }

        Function<String , Integer> function =  t -> t.length();
        System.out.println(function.apply("nayan"));


        Function<String , Integer> ref = String::length;
        System.out.println(ref.apply("kundan"));


    }
}
