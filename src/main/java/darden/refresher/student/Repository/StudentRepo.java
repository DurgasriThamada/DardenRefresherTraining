package darden.refresher.student.Repository;

import darden.refresher.student.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepo extends JpaRepository<Student, Long> {
    Optional<Student> findByEmailId(String emailId);
}
