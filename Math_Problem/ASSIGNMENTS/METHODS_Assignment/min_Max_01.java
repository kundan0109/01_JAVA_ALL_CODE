package Math_Problem.ASSIGNMENTS.METHODS_Assignment;

public class min_Max_01 {

    public static void main(String[] args) {
        System.out.println("The max of three is"  + max(40, 70, 30));
        System.out.println("The min of three is " + min(56, 89, 15));
    }

    private static int min(int n1, int n2, int n3) {
        return (n1 < n2 && n1 < n3 ? n1 : n2 < n1 && n2 < n3 ? n2 : n3);
    }

    private static int max(int n1, int n2, int n3) {
        return (n1 > n2 && n1 > n3 ? n1 : n2 > n1 && n2 > n3 ? n2 : n3);
    }


}
