package Class_Object.SalmanSir;

public class Animal {

    public static void main(String[] args) {

    }

    void makeSound() {

    }
}

class Arti extends Animal {
    Arti arti= new Arti();

    @Override
    void makeSound() {
        System.out.println(" gadha prasad");
    }
}

class Donkey extends Animal {
    @Override
    void makeSound() {
        System.out.println(" dhechu dhechu ");
    }
}

