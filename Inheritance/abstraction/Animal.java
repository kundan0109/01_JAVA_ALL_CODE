package Inheritance.abstraction;

abstract class Animal {
    abstract void sound();
}

class Lion extends Animal{
    @Override
    void sound() {
        System.out.println("Lion Roar ");
    }
}

class Tiger extends Animal{
    @Override
    void sound() {
        System.out.println("Tiger roar");
    }
}

class Final {
    public static void main(String[] args) {
        Animal animal = new Lion();
        animal.sound();
        Animal animal1 = new Tiger();
        animal1.sound();
    }
}