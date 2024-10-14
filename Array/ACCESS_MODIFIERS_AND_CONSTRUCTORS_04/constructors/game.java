package Array.ACCESS_MODIFIERS_AND_CONSTRUCTORS_04.constructors;

import java.util.Random;
import java.util.Scanner;


public class game {
    static int count;

    public static void main(String[] args) {
        int random = getRandomInput();
        System.out.println(random);
        m1(random);
    }

    private static void m1(int random) {

        int input = getUserInput();
        isCOrrectNumber(random, input);
    }

    private static int getUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number input : ");
        int input = sc.nextInt();
        return input;
    }

    private static void isCOrrectNumber(int random, int input) {
//        System.out.println(random);
        if (random == input) {
            count++;
            String name = getName();
            System.out.printf("%s you got the number %d with " , name, input);
            System.out.printf("the score  %d", game.count);
        } else if (random > input) {
            System.out.println("enter bigger number : ");
            game.count++;
            m1(random);
        } else if (random < input) {
            System.out.println("enter smaller number : ");
            game.count++;
            m1(random);

        }
    }

    private static String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name : ");
        String name = scanner.nextLine();
        return name;
    }

    private static int getRandomInput() {
        Random rd = new Random();
        int random = rd.nextInt(100);
        return random;
    }


}
