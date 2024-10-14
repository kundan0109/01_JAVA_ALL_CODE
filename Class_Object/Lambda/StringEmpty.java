package Class_Object.Lambda;

public class StringEmpty {
    public static void main(String[] args) {

        interface First {
            Boolean status(String str);
        }
        First first = str -> str == "";
        System.out.println(first.status(""));

    }
}
