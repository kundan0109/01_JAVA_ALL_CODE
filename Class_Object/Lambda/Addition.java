package Class_Object.Lambda;

public class Addition {
    public static void main(String[] args) {

        interface First{
            int add(int a, int b);
        }
        First first = ((a, b) -> a + b);
        System.out.println(first.add(5,6));

    }
}
