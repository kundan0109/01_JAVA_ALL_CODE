package Array.ACCESS_MODIFIERS_AND_CONSTRUCTORS_04.constructors;

public class  practice01 {
    int radius ;
    int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public static void main(String[] args) {

        practice01 practice01 = new practice01();
        System.out.println(" radius : " +practice01.getRadius());
        System.out.println(" height  : " +practice01.getRadius());
        practice01.setRadius(5);
        System.out.println(" radius : " + practice01.getRadius());;
        practice01.setHeight(10);
        System.out.println(" height  : " +practice01.getHeight());;

        System.out.println("area is : " + getArea( practice01.radius, practice01.height));
        System.out.println("volume  is : " + getVolume( practice01.radius, practice01.height));

    }

    private static double getVolume(int radius, int height) {
        return (Math.PI * radius * radius * height);
    }

    private static double getArea(int radius, int height) {

            return ((2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius));
//        return (2 * Math.PI * radius *( radius + height ));

    }

}
