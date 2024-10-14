package Inheritance.abstraction;

abstract class Shape{
    abstract double calArea();
    abstract double calPerimeter();
}

class Circle extends Shape{
    private double radius;

    public Circle (int radius){
        this.radius = radius;
    }


    @Override
    double calArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends Shape{
    private double side1;
    private double side2;
    private double side3;

    public Triangle(int side1, int side2, int side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    @Override
    double calArea() {
        double s = (side1 + side2 + side3) / 2.0;
        return Math.sqrt((s * (s - side1) * (s - side2) * (s - side3)));
    }

    @Override
    double calPerimeter() {
        return side1 + side2 + side3;
    }
}

class Test{
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        System.out.println(" Area of Circle is " + circle.calArea());
        System.out.println(" Perimeter of Circle is " + circle.calPerimeter());

        Shape triangle = new Triangle(3, 4, 5);
        System.out.println(" Area of Triangle is " + triangle.calArea());
        System.out.println(" Perimeter of Triangle is " + triangle.calPerimeter());

    }
}