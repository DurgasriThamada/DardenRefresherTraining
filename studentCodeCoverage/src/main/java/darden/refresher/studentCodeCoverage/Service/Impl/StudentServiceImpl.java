package darden.refresher.studentCodeCoverage.Service.Impl;


import darden.refresher.studentCodeCoverage.Entity.Student;
import darden.refresher.studentCodeCoverage.Repository.StudentRepo;
import darden.refresher.studentCodeCoverage.Service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private StudentRepo studentRepo;


    @Override
    public Student createStudent(Student studentDTO) {

       Student savedStudent = studentRepo.save(studentRepo.findById(studentDTO.getId()).get());
      return savedStudent;
    }

    @Override
    public Student getUserById(long id){
        Student student = studentRepo.findById(id).get();
        return student;
    }

    @Override
    public Student updateStudent(Student studentDTO){
        Student existingStudent = studentRepo.findById(studentDTO.getId()).get();
        existingStudent.setFirstName(studentDTO.getFirstName());
        existingStudent.setLastName(studentDTO.getLastName());
        existingStudent.setEmailId(studentDTO.getEmailId());
        Student updatedStudent= studentRepo.save(existingStudent);
        return updatedStudent;
    }


}
