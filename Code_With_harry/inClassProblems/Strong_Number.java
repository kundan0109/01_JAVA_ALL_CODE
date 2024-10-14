package Code_With_harry.inClassProblems;


//        A Strong Number is a special number whose sum of the factorial of its digits is equal to the original number.

public class Strong_Number {
    public static void main(String[] args) {

        int number = 145;
        int original_No = number;
        int digit;
        int product;
        int sum = 0;


        while (number > 0) {
            digit = number % 10;
            product = 1;
            for (int i = digit; i > 0; i--) {
                product = product * i;
            }
            sum = sum + product;

            number = number / 10;


        }
        if (original_No == sum) {
            System.out.println(" Strong number ");
        } else {
            System.out.println(" not a strong number ");
        }
    }
}
