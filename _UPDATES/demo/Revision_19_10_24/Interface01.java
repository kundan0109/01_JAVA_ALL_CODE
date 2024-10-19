package _UPDATES.demo.Revision_19_10_24;



@FunctionalInterface
interface Interface01 {
    void m1();
    default void m2(){}
}


class C implements Interface01{

    @Override
    public void m1() {

    }


}