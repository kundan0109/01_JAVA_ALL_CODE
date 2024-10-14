package Math_Problem.ASSIGNMENTS.OBJECTS_AND_CLASSES;

public class rectangle01 {

    public static void main(String[] args) {
        int length = 10;
        int breadth = 20;
        int result = inputs(length, breadth);
        System.out.println("Aera is "+ result);
    }


    static int  inputs(int length , int breadth){

        return area(length, breadth);
    }

    static int area (int length, int breadth){
        return length * breadth;
    }
}
