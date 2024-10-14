package Inheritance.inheritance;

public class Employee {
    public static void main(String[] args) {

        class Employee1{
            void work(){}
            int getSalary (){
            return 0;}
        }
        class HRManager extends Employee1{
            @Override
            void work() {
                System.out.println("HrManager work");
            }
            void addEmployee(){
                System.out.println("Employee Added");
            }
        }
        HRManager hrManager = new HRManager();
        hrManager.work();
        hrManager.addEmployee();
    }
}
