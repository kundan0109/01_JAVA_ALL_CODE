package _UPDATES.demo.Revision_19_10_24;

interface Anonymous01 {
    void m1();
}

class InnerrChild {
    public static void main(String[] args) {
        Anonymous01 anonymous01 = new Anonymous01() {
            @Override
            public void m1() {
                System.out.println("Working inner");
            }
        };

        anonymous01.m1();

    }
}