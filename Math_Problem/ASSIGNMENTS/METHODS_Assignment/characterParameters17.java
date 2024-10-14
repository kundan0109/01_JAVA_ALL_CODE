package Math_Problem.ASSIGNMENTS.METHODS_Assignment;

//Create a class to print an integer and a character with two methods having the same name but different sequence of the integer and the character parameters.
//
//For example, if the parameters of the first method are of the form (int n, char c), then that of the second method will be of the form (char c, int n).

public class characterParameters17 {

    public static void main(String[] args) {
       m25('g', 10);
       m25(12, 'p');

    }

    private static void m25(int k, char p){
        System.out.println(k);
        System.out.println(p);
    }

    private static void m25(char k, int p){
        System.out.println(k);
        System.out.println(p);
    }

}
