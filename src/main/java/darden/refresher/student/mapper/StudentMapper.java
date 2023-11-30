package darden.refresher.student.mapper;

import darden.refresher.student.Entity.Student;
import darden.refresher.student.dto.StudentDTO;

public class StudentMapper {
    public static StudentDTO mapToStudentDTO(Student student){
        StudentDTO studentDTO = new StudentDTO(
                                student.getId(),
                                student.getFirstName(),
                                student.getLastName(),
                                student.getEmailId()
                                );
        return studentDTO;
    }

    public static Student mapToStudent(StudentDTO studentDTO){
        Student student = new Student(studentDTO.getId(),
                                studentDTO.getFirstName(),
                                studentDTO.getLastName(),
                                studentDTO.getEmailId()
                                );
        return  student;
    }

}