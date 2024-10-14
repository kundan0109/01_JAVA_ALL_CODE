package Math_Problem.ASSIGNMENTS.Methods;

public class ArtiStudenPrint19
{
    String name;
    int age;
    String address;


    //  zero parameterized constructor

    public ArtiStudenPrint19(){
        this.name="unknown"  ;
        this.age= 0;
        this.address="not available";
    }

    public  void setInfo(String name,int age){
        System.out.println(" student name:-"+name);
        System.out.println("student age :-"+age);


    }
    public  void  setInfo(String name,int age,String address){
        System.out.println(" student name:-"+name+ " "  +  "student age :-"+age+ " "+ " student addresss:-"+address);
    }

    public  static void main(String []args)
    {
        ArtiStudenPrint19 st=new ArtiStudenPrint19();

        st.setInfo("shital",23);
        st.setInfo("arti",23,"mihan");
    }



}