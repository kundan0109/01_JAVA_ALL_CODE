package Math_Problem.ASSIGNMENTS.Methods.CourseApp;

public class CourseController {

    // line number 7 gets the memory when the object of CourseController class is created so that all the instance variable will be called

    CourseServices courseServices = new CourseServices();
            // courseServices is Instance refrence variable becoz
    // outside all method so instance
    // refrence of object so refrence variable




    public void addStudent(){
        courseServices.addStudent();
    }

    public void editStudent(){
        courseServices.editStudent();
    }

    public void deleteStudent(){
        courseServices.deleteStudent();
    }

}
