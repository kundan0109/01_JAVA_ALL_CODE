package Inheritance.interface2;

public interface Shape {
    void getArea ();
}

class Rectangel implements Shape{
    private double length;
    private double breadth;

    public Rectangel(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void getArea() {
        System.out.println("Area of Rectangel is : " + (length * breadth));
    }
}

class Circle implements Shape{
    private double radius ;
    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public void getArea() {
        System.out.println("Area of circle is : " + Math.PI * radius * radius);
    }
}

class Main{
    public static void main(String[] args) {
        Rectangel rectangel = new Rectangel(6, 5);
        rectangel.getArea();

        Circle circle = new Circle(5);
        circle.getArea();
    }
}