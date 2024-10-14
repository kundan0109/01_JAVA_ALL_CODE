package Array.ACCESS_MODIFIERS_AND_CONSTRUCTORS_04.constructors;

public class practice02 {
    int radius;
    int height;

    public practice02(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }


    public practice02(){

    }

    public static void main(String[] args) {
        practice02 practice023 = new practice02();
        System.out.println(practice023.radius);
        System.out.println(practice023.height);

        practice02 practice02 = new practice02(5, 10);
        System.out.println(practice02.radius);
        System.out.println(practice02.height);

        getArea(practice02.radius, practice02.height);
        getVolume(practice02.radius, practice02.height);
    }

    private static void getVolume(int radius, int height) {
        System.out.println("volume : " + Math.PI * radius * radius * height);
    }

    private static void getArea(int radius, int height) {

        System.out.println("areaa : "+2 * Math.PI * radius *( radius + height ));

    }
}
