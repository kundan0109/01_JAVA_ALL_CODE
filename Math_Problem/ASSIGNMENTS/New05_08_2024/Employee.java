package Math_Problem.ASSIGNMENTS.New05_08_2024;

/*
### 1. *Employee Management allInOne.ASSIGNMENTS.System*

*Description:* Create a class Employee with the following attributes:
- Instance variables: id, name, department, salary.
- Static variable: totalEmployees to keep track of the total number of employees.

*Tasks:*
- Create a constructor to initialize the id, name, department, and salary of the employee.
- Write a method displayDetails() to display the employee's details.
- Write a static method displayTotalEmployees() to display the total number of employees.
- Write a main method to create several Employee objects and demonstrate the use of static and instance members.
 */
public class Employee {

    int id ;
    String name ;
    String department ;
    int Salary ;
    static int totalEmployees ;

    Employee(){
        id = 1;
        name = "nikita" ;
        department  = " CSE ";
        Salary  = 500000 ;
    }

    void displayDetails(  ){
        System.out.println(id);
        System.out.println(name);
        System.out.println(department);
        System.out.println(Salary);
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.displayDetails();
        Employee.displayTotalEmployees();
    }

    private static void displayTotalEmployees() {
        System.out.println(Employee.totalEmployees);
    }
}
