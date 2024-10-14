package Array.INHERITANCE_05;

class Base {
    Base() {
        System.out.println("Base of 0 var ");
    }
    Base(int x, int y) {
        System.out.println("Base of 2 var ");
    }
    Base(int x, int y, int z) {
        System.out.println("Base of 3 var ");
    }


}

class Derived extends Base11 {
    Derived() {
        super();
        System.out.println("Derived of 0 var ");
    }
    Derived(int x, int y) {
        super(x, y);
        System.out.println("Derived of 2 var ");
    }
    Derived(int x, int y, int z) {
        super(x, y, z);
        System.out.println("Derived of 3 var ");
    }
}

class ChildOfDerived extends Derived11 {
    ChildOfDerived() {
        super();
        System.out.println("ChildOfDerived of 1 var ");
    }
    ChildOfDerived(int x, int y) {
        super(x, y);
        System.out.println("ChildOfDerived of 5 var ");
    }
    ChildOfDerived(int x, int y, int z) {
        super(x, y, z);
        System.out.println("ChildOfDerived of 3 var ");
    }
}


public class Inheritance002 {
    public static void main(String[] args) {
        ChildOfDerived11 childOfDerived = new ChildOfDerived11();

    }
}
