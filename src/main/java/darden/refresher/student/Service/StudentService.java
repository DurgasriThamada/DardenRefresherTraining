package darden.refresher.student.Service;

import darden.refresher.student.Entity.Student;
import darden.refresher.student.Exception.ResourceNotFoundException;
import darden.refresher.student.dto.StudentDTO;

import java.util.List;

public interface StudentService {
    public StudentDTO createStudent(StudentDTO studentDTO);

    public List<StudentDTO> getAllStudents();

    public  StudentDTO getUserById(long id) throws ResourceNotFoundException;

    public StudentDTO updateStudent(StudentDTO studentDTO) throws ResourceNotFoundException;

    public void deleteStudent(Long studentId) throws ResourceNotFoundException;
}
