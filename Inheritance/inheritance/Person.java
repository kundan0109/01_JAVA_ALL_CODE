package Inheritance.inheritance;

class Person {
    public static void main(String[] args) {

        class Person1{
            String firstname ;
            String lastName ;

            Person1 (String firstName, String lastName){
                this.firstname = firstName;
                this.lastName = lastName;
            }
        }

        class Employee extends Person1{
            int EmployeeId ;
            String jobTItle ;

            Employee ( String firstName , String lastName, int EmployeeId, String jobTitle){
                super(firstName, lastName);
                this.EmployeeId = EmployeeId;
                this.jobTItle = jobTitle;
            }
            void getEmployeeYields (){
                System.out.println("first  : " + firstname);
                System.out.println("last  : " + lastName);
                System.out.println("Emp_Id  : " + EmployeeId);
                System.out.println("TItle  : " + jobTItle);
            }
        }

        Employee employee = new Employee("Aarti ", "Chaple", 25, "Life Cycle Engineer");
        employee.getEmployeeYields();
    }
}