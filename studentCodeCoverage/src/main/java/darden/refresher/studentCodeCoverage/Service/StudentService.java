package darden.refresher.studentCodeCoverage.Service;

import darden.refresher.studentCodeCoverage.Entity.Student;

import java.util.List;

public interface StudentService {
    public Student createStudent(Student student);

    public Student getUserById(long id) ;

    public Student updateStudent(Student studentDTO) ;

}
