package darden.refresher.student.Service.Impl;

import darden.refresher.student.Exception.EmailAlreadyExistsException;
import darden.refresher.student.Exception.ErrorDetails;
import darden.refresher.student.Exception.ResourceNotFoundException;
import darden.refresher.student.Repository.StudentRepo;
import darden.refresher.student.Service.StudentService;
import darden.refresher.student.Entity.Student;
import darden.refresher.student.dto.StudentDTO;
import darden.refresher.student.mapper.StudentMapper;
import darden.refresher.student.mapper.StudentMapperMapStruct;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.boot.Banner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private StudentRepo studentRepo;

    private ModelMapper modelMapper;

    @Override
    public StudentDTO createStudent(StudentDTO studentDTO) {
//        Student student = StudentMapper.mapToStudent(studentDTO);  using customMapper
//        Student student = modelMapper.map(studentDTO,Student.class); //using ModelMapper(pre defined)
        Optional<Student> optionalStudent= studentRepo.findByEmailId(studentDTO.getEmailId());
        if(optionalStudent.isPresent()){
            throw new EmailAlreadyExistsException("Email already exists!");
        }
        Student student = StudentMapperMapStruct.MAPPER.mapToStudent(studentDTO); //using MapStruct(pre defined)
        Student savedStudent = studentRepo.save(student);
//        StudentDTO savedStudentDTO = StudentMapper.mapToStudentDTO(savedStudent);
//        StudentDTO savedStudentDTO = modelMapper.map(savedStudent,StudentDTO.class);
        StudentDTO savedStudentDTO = StudentMapperMapStruct.MAPPER.mapToStudentDTO(savedStudent);
        return savedStudentDTO;
    }

    @Override
    public List<StudentDTO> getAllStudents() {
        List<Student> students= studentRepo.findAll();
//        return students.stream().map(StudentMapper::mapToStudentDTO)
//                .collect(Collectors.toList());
//        return students.stream().map((student)->modelMapper.map(student,StudentDTO.class))
//                .collect(Collectors.toList());
        return students.stream().map((student)->StudentMapperMapStruct.MAPPER.mapToStudentDTO(student))
                .collect(Collectors.toList());
    }

    @Override
    public StudentDTO getUserById(long id){
        Student student = studentRepo.findById(id).orElseThrow(
                ()->new ResourceNotFoundException("Student","id",id)
        );
//        return StudentMapper.mapToStudentDTO(optionalStudent.get());
//        return modelMapper.map(optionalStudent.get(),StudentDTO.class);
        return  StudentMapperMapStruct.MAPPER.mapToStudentDTO(student);
    }

    @Override
    public StudentDTO updateStudent(StudentDTO studentDTO){
        Student existingStudent = studentRepo.findById(studentDTO.getId()).orElseThrow(
                ()-> new ResourceNotFoundException("Student","id",studentDTO.getId())
        );
        existingStudent.setFirstName(studentDTO.getFirstName());
        existingStudent.setLastName(studentDTO.getLastName());
        existingStudent.setEmailId(studentDTO.getEmailId());
        Student updatedStudent= studentRepo.save(existingStudent);
//        return StudentMapper.mapToStudentDTO(updatedStudent);
//        return modelMapper.map(updatedStudent, StudentDTO.class);
        return StudentMapperMapStruct.MAPPER.mapToStudentDTO(updatedStudent);
    }

    @Override
    public void deleteStudent(Long studentId) {
        Student existingStudent = studentRepo.findById(studentId).orElseThrow(
                ()-> new ResourceNotFoundException("Student","id",studentId)
        );
        studentRepo.deleteById(studentId);
    }

}
