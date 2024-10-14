package Math_Problem.ASSIGNMENTS.METHODS_PRACTICE.methods_Sir;

public class CourseController {
    CourseService courseService = new CourseService();

    public void addCourse() {
        courseService.addCourse();
    }

    public void editCourse() {

        courseService.editCourse();
    }

    public void deleteCourse() {

        courseService.deleteCourse();
    }

}