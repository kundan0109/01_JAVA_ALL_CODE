package Array.INHERITANCE_05;

///T    TAKING FEATURES FROM THE PARENT CLASS TO THE CHILD CLASS OR DERIVED CLASS


class BaseParent{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

//SUBXLASS EXTEND SUPERCLASS
class DerivedChild extends BaseParent{

    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}


public class Inheritance01 {

    public static void main(String[] args) {


        // HERE WE ARE CREATING SUPER CLASS OBJECT

        /*BaseParent baseParent = new BaseParent();
        System.out.println(baseParent.getX());
        baseParent.setX(5);
        System.out.println(baseParent.getX());*/

        //         // HERE WE ARE CREATING sub CLASS OBJECT
        // you can access the methods of superclass to subclass   ----> inheritance
        //but vice vreasa not possible



        /*DerivedChild derivedChild = new DerivedChild();
        System.out.println(derivedChild.getX());
        derivedChild.setX(5);
        System.out.println(derivedChild.getX());

        System.out.println(derivedChild.getY());
        derivedChild.setY(10);
        System.out.println(derivedChild.getY());*/




    }
}
