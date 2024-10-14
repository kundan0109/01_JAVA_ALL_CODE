package Array.INHERITANCE_05;

class Base11 {
    Base11() {
        System.out.println("Base of 0 var ");
    }
    Base11(int x, int y) {
        System.out.println("Base of 2 var ");
    }
    Base11(int x, int y, int z) {
        System.out.println("Base of 3 var ");
    }


}

class Derived11 extends Base11 {
    Derived11() {
        super();
        System.out.println("Derived of 0 var ");
    }
    Derived11(int x, int y) {
        super(x, y);
        System.out.println("Derived of 2 var ");
    }
    Derived11(int x, int y, int z) {
        super(x, y, z);
        System.out.println("Derived of 3 var ");
    }
}

class ChildOfDerived11 extends Derived11 {
    ChildOfDerived11() {
        super();
        System.out.println("ChildOfDerived of 1 var ");
    }
    ChildOfDerived11(int x, int y) {
        super(x, y);
        System.out.println("ChildOfDerived of 2 var ");
    }
    ChildOfDerived11(int x, int y, int z) {
        super(x, y, z);
        System.out.println("ChildOfDerived of 3 var ");
    }
}


public class Inheritance012 {
    public static void main(String[] args) {
        ChildOfDerived11 childOfDerived = new ChildOfDerived11(5, 6);

    }
}
