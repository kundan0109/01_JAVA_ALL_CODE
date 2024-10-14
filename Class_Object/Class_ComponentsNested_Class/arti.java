package Class_Object.Class_ComponentsNested_Class;

public class arti {
    private final int id;
    private final String name;

    public arti(int id, String name) {
        this.id = id;
        this.name = name;
    }

    static void m1() {
        System.out.println("m1 static method");
    }

}

class kt extends arti {

    public kt(int id, String name) {
        super(id, name);
    }

    void m122() {

    }

    arti ref = new kt(5, "nikita");

}