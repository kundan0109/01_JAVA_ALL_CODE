package Array.METHODS_02_JAVA;
///
// to segregate a big logic into small divisions
///  DRY PRINCIPAL --->do not repeat yourself
// Methods call pass the copy of the variable not the original
// when you pass

public class METHODS01 {
    public static void main(String[] args) {
        int [] marks = { 1, 2, 3, 4, 5};
        change(marks);

        System.out.println(marks[0]);

    }
//      MARKS IS A REFRENCE VARIABLE SO IT WILL PASS THE ADDRESS OF THE ARRAY OBJECT SO IT IS MUTABLE
    //IT IS CHANGABLE
    //ARRAY IS AN OBJECT

    static void change(int[] marks){
        marks[0] = 10;
    }


}
