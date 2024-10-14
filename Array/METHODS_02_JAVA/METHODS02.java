package Array.METHODS_02_JAVA;

//OVERLOADED METHODS   --> SAME METHOD NAME DIFFERENT PARAMETERS
// you cannot use it by changing return type

public class METHODS02 {
    public static void main(String[] args) {
        foo();              // METHOD OVERLOADING foo
        foo(10);            // ARGUMENTS --> 10      "(ARGUMENTS ARE ACTUAL)"
    }

    private static void foo() {
        System.out.println("no parametere");
    }

    private static void foo(int k) {                // PARAMETER --> K
        System.out.println(k);
    }

}
