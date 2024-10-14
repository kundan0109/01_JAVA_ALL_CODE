package Inheritance.abstraction;

public class Abstraction02 {
    public static void main(String[] args) {

        abstract class A{
            abstract void m1();
        }

        class B extends A{
            @Override
            void m1() {
                System.out.println("Clas B ");
            }
            void m2(){

            }
        }

        class C extends B{

        }

    }
}
