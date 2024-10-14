package Array.ARRAYS_01_JAVA;

public class practice01 {
    public static void main(String[] args) {

        //01 sum of 5 float array element

        float [] num = {20.2f, 56.2f, 9.3f, 65.66f, 98.98f};

        float sum = 0;

        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        System.out.println(sum);

//        for (float elment : num){
//            sum = sum + elment;
//        }
//        System.out.println(sum);


        //
    }
}
