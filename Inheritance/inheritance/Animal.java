package Inheritance.inheritance;

class Animal{
    public static void main(String[] args) {
        class Animal1{
            void makeSound(){

                System.out.println("Animal bark ");
            }
        }
        class Cat extends Animal1{
            @Override
            void makeSound() {
//                super.makeSound();
                System.out.println("bark of cat ");
            }
        }
        Animal1 cat = new Cat();
        cat.makeSound();


    }
}
