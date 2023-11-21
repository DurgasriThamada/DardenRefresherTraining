package refresherTraining.springBoot.CourseManagement.Service;

import java.util.List;

import refresherTraining.springBoot.CourseManagement.Models.Course;

public interface CourseService {
    List<Course> getAllCourses();
    Course getCourseById(Long courseId);
    void addCourse(Course course);
    void updateCourse(Long courseId, Course course);
    void deleteCourse(Long courseId);
}
