package Inheritance.abstraction;

public class Abstraction01 {

    public static void main(String[] args) {
        Child child = new Child();
        child.m1();
    }
}

class Parent {
    int x = 1;
    int y = 1;
    int z = 1;
}

class Child extends Parent {
    int x = 10;
    int y = 10;
    int z = 10;

    void m1() {
        int x = 100;
        int y = 100;
        int z = 100;
        System.out.println(x + " " + y + " " + z + " ");
        System.out.println(this.x + " " + this.y + " " + this.z + " ");
        System.out.println(super.x + " " + super.y + " " + super.z + " ");
    }
}
