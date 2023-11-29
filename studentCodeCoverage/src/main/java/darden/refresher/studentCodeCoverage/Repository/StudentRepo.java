package darden.refresher.studentCodeCoverage.Repository;

import darden.refresher.studentCodeCoverage.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepo extends JpaRepository<Student, Long> {
}
