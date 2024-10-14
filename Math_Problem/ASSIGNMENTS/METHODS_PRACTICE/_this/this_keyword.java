package Math_Problem.ASSIGNMENTS.METHODS_PRACTICE._this;
// THIS KEYWORD USE
public class this_keyword {
    public static void main(String[] args) {
        this_keyword obj = new this_keyword();

        obj.first();
    }



    void first(){
        System.out.println("firdt");
        this.second();
    }

    void second(){
        System.out.println("second ");
    }
}

