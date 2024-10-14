package Math_Problem.ASSIGNMENTS.Methods.CourseApp;

public class CourseServices {

    CourseDAO courseDAO = new CourseDAO();

    public void addStudent(){
        courseDAO.addStudent();
    }

    public void editStudent(){
        courseDAO.editStudent();
    }

    public void deleteStudent(){
        courseDAO.deleteStudent();
    }
}
