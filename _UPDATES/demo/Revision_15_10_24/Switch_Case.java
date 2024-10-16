package _UPDATES.demo.Revision_15_10_24;

public class Switch_Case {
    public static void main(String[] args) {
        int value = 5;

        if (10>8){
            System.out.println("pass");
        }
        switch (value){
            case 1 ->
                System.out.println("january");
            case 2->
                System.out.println("fervery");
            case 3->
                System.out.println("march");
            case 4->
                System.out.println("april");
            case 5->
                System.out.println("may");
            default->
                System.out.println("invalid");
        }
    }
}
