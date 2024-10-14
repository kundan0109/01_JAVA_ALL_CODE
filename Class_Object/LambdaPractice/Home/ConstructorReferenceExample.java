package Class_Object.LambdaPractice.Home;

import java.util.function.Function;

class Person {
    String name;

    // Constructor
    Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person's name: " + name;
    }
}

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        // Lambda expression to create a new Person
        Function<String, Person> lambdaExample = name -> new Person(name);

        // Constructor reference to create a new Person
        Function<String, Person> constructorRefExample = Person::new;

        // Using the constructor reference to create an object
        Person person = constructorRefExample.apply("John Doe");

        // Output the person's name
        System.out.println(person);
    }
}
