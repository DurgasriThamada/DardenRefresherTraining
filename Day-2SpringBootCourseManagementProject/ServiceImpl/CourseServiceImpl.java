package refresherTraining.springBoot.CourseManagement.ServiceImpl;

import org.springframework.stereotype.Service;

import refresherTraining.springBoot.CourseManagement.Models.Course;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CourseServiceImpl implements CourseService {

    private final Map<Long, Course> coursesMap = new HashMap<>();

    public CourseServiceImpl() {
        // Initialize static data
        Course course1 = new Course(1L, "Java Programming", "John Doe", 8);
        Course course2 = new Course(2L, "Spring Boot Basics", "Alice Smith", 6);

        coursesMap.put(course1.getId(), course1);
        coursesMap.put(course2.getId(), course2);
    }

    @Override
    public List<Course> getAllCourses() {
        return new ArrayList<>(coursesMap.values());
    }

    @Override
    public Course getCourseById(Long courseId) {
        return coursesMap.get(courseId);
    }

    @Override
    public void addCourse(Course course) {
        coursesMap.put(course.getId(), course);
    }

    @Override
    public void updateCourse(Long courseId, Course course) {
        if (coursesMap.containsKey(courseId)) {
            coursesMap.put(courseId, course);
        }
    }

    @Override
    public void deleteCourse(Long courseId) {
        coursesMap.remove(courseId);
    }
}
