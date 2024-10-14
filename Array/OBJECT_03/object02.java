package Array.OBJECT_03;

public class object02 {
    int id;
    String name;

    public void printDetais() {
        System.out.println(this.id);
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        // creating / INITIATING OBJECT
        object02 obj = new object02();

        // SETTING ATTRIBUTE
        obj.id = 66;
        obj.name = " eleven ";

        // PRINT ATTRIBUTE
        System.out.println(obj.id);
        System.out.println(obj.name);


        obj.printDetais();

        object02.kl();

    }


    public static void kl() {
        object02 objkl = new object02();
        objkl.id = 55;
        objkl.printDetais();
    }



}

class employee {
    public static void main(String[] args) {
        object02 obj = new object02();
        obj.id = 10;
        obj.name = " kirti ";
        obj.printDetais();


    }
}

