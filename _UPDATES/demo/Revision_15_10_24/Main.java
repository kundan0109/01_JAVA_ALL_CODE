package _UPDATES.demo.Revision_15_10_24;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }

    void fetch() {
        System.out.println("Dog fetches a ball");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Upcasting (implicit)

        if (animal instanceof Dog) {
            Dog dog = (Dog) animal; // Downcasting (explicit)
            dog.fetch(); // Dog's specific method
        }
    }
}
