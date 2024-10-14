package Math_Problem.ASSIGNMENTS.OBJECTS_AND_CLASSES;

public class triangle03 {
    public static void main(String[] args) {
        triangle03.p1();
    }

    static void p1() {
        int x = 3;
        int y = 4;
        int z = 5;
        System.out.println(x+y+z);
        triangle03 obj = new triangle03();
        obj.a1();
    }

    void a1() {
        float x = 3;
        float y = 4;
        float z = 5;
        float t = x + y + z;

        // heron's formula

        float s = t/2;

        float herons = s * ( s - x) * (s - y) * (s - z );

        double area = Math.sqrt(herons);

        System.out.println(area);



    }

}
