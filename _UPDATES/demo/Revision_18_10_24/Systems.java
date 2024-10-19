package _UPDATES.demo.Revision_18_10_24;

class Systems {
    static PrintStreams out = new PrintStreams();


}

class PrintStreams {
    void println(String message) {
        System.out.println(message);
    }
}

class test{
    public static void main(String[] args) {
        Systems.out.println("hello");
    }
}