package darden.refresher.student.mapper;

import darden.refresher.student.Entity.Student;
import darden.refresher.student.dto.StudentDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudentMapperMapStruct {

    StudentMapperMapStruct MAPPER = Mappers.getMapper(StudentMapperMapStruct.class);
    Student mapToStudent(StudentDTO studentDTO);

    StudentDTO mapToStudentDTO(Student student);
}
