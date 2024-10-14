package Class_Object.LambdaPractice.Home;

import java.util.function.Predicate;

//  Predicate --> any input boolean output and test method

public class PREDICATE {
    public static void main(String[] args) {


//        interface Predicate<X> {
//            boolean m1(X x);
//        }

        Predicate<String> predicate = x -> x.startsWith("A");

        Predicate<Integer> integerPredicate = x -> x % 3 == 0;

        System.out.println(predicate.test("Ankita"));
        System.out.println(integerPredicate.test(66));
    }
}
