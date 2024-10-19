package _UPDATES.demo.Revision_19_10_24;

abstract class AbstractClass {
    abstract void draw();
}

class Shape {
    public static void main(String[] args) {
    AbstractClass abstractClass = new AbstractClass() {
        @Override
        void draw() {
            System.out.println("Drawing");
        }
    };
    abstractClass.draw();
    }
}