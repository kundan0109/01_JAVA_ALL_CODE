package Math_Problem.ASSIGNMENTS.METHODS_PRACTICE.methods_Sir;

public class CourseService {
    CourseDao courseDao = new CourseDao();

    public void addCourse(){
        courseDao.addCourse();
    }
    public void editCourse(){
        courseDao.editCourse();
    }
    public void deleteCourse(){
        courseDao.deleteCourse();
    }
}