package _UPDATES.demo.Revision_19_10_24;

interface LambdaFunction {
    int mul(int number);
}

class mm {
    public static void main(String[] args) {
        LambdaFunction lambdaFunction = number -> number * number;

        System.out.println(lambdaFunction.mul(11));
    }
}