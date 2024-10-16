package _UPDATES.demo.Revision_15_10_24;

public class CallByValue {
    int id ;
    String name;
    public static void main(String[] args) {
        CallByValue callByValue = new CallByValue();
        ChangeValues(callByValue);
        System.out.println(callByValue.id + " is old id " + " and " + callByValue.name + " is old name ");
    }

    private static void ChangeValues(CallByValue callByValue) {
        callByValue = new CallByValue();
        callByValue.id = 101;
        callByValue.name = "lucy";
        System.out.println(callByValue.id + " is new id " + " and " + callByValue.name + " is new name ");
    }
}
