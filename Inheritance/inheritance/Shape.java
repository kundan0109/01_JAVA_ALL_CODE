package Inheritance.inheritance;

public class Shape {
    public static void main(String[] args) {

        class Shape1{
            void getArea(){}
        }

        class Rectangle extends Shape1{
            int length , breadth;
            Rectangle(int length , int breadth){
                this.length = length;
                this.breadth = breadth;
            }

            @Override
            void getArea() {
                System.out.println("Area of rectangle is " + length * breadth);
            }
        }

        Shape1 rectangle = new Rectangle(5, 6);
        rectangle.getArea();

    }
}
